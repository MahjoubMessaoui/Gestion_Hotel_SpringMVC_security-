package org.sid.metier;

import org.sid.dao.IRéservationRepository;
import org.sid.entities.réservation;
import org.springframework.beans.factory.annotation.Autowired;

public class IréservationImp {
	
	@Autowired 
	private IRéservationRepository réservationRepository;
	
	public réservation findréservation(Long idre) {
		// TODO Auto-generated method stub
		return null;
	}


	public réservation findréservation(String name) {
		
		réservation  réseravtion =réservationRepository.getréservationParNom(name);
		 if (réseravtion==null) throw new RuntimeException("Compte introuvable");
		return réseravtion;
	}

	public réservation getréservation(Long i) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	

}
