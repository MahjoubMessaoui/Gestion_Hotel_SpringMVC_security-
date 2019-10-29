package org.sid.metier;

  
import java.util.List;

import org.sid.entities.Client;
import org.sid.entities.Operation;
import org.sid.entities.réservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public interface IhotelMetier {
	
	
	  public Client getClient(Long i);
     
	  //public Page<réservation> listréservation(Long idClient,int page,int sizePage);
	Client findClient(Long idClient);
	
	 
	 

	  


	
}
