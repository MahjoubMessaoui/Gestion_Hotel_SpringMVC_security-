package org.sid.metier;

import org.sid.dao.IClientRepository;
import org.sid.dao.IRéservationRepository;
import org.sid.entities.Client;
import org.sid.entities.réservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional 
public class IhotelMetierImp implements IhotelMetier {
	
	@Autowired 
	private IClientRepository clientRepository;
	
	
	
	
	
	

	@Override
	public Client getClient(Long idClient) {
		Client client=clientRepository.getOne(idClient);
		 if (client==null) throw new RuntimeException("Compte introuvable");
		return client;
	}
	/*//@Override
	public Page<réservation>listréservation(Long idClient, int page, int sizePage) {
		return réservationRepository.listOperation(idClient,new  PageRequest(page,sizePage));
	}
*/
	
	public Client findClient(String nomClient) {
		
		Client client=clientRepository.getClientParNom(nomClient);
		 if (client==null) throw new RuntimeException("Compte introuvable");
		return client;
	}


	
	@Override
	public Client findClient(Long idClient) {
		// TODO Auto-generated method stub
		return null;
	}


}
	


	

	
	




	