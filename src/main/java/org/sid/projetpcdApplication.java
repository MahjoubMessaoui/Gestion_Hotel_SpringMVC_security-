package org.sid;

import java.util.Date;

import org.sid.dao.IClientRepository;

import org.sid.dao.IOperationRepository;
import org.sid.dao.IRéservationRepository;
import org.sid.entities.Client;
import org.sid.entities.Operation;
import org.sid.entities.réservation;
import org.sid.metier.IhotelMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository; 

@SpringBootApplication
public class projetpcdApplication  implements CommandLineRunner{   //cette implementation de cette interface permet de tester dans la meme class et obligne de redefinir la methode run de cette interface
    @Autowired
	private IClientRepository iClientRepository;
	
    @Autowired
   	private IRéservationRepository IréservationRepository;
    
    @Autowired
   	private IOperationRepository iOperationRepository;

    /*@Autowired
   	private IOperationRepository hotelRepository;*/
    
    //pour tester la couche metier
    @Autowired
   	private IhotelMetier ihotelMetier;
    
    
	public static void main(String[] args) { 
		
		  SpringApplication.run(projetpcdApplication.class, args);
	
	//IClientRepository iClientRepository = applicationContext.getBean(IClientRepository.class);
	 
	}

	
	
	@Override  //annotation averride puisqu'elle est de l'interfaceCommandLineRunner et sa redefinition est obligatoire ----->  ceci permet de faire le test dans cette methode
	public void run(String... arg0) throws Exception {
	
		Client client1 = iClientRepository.save(new Client("mahjoub","messaoui", "jee")); 
		Client client2 = iClientRepository.save(new Client("khaled","baba", "angular")); // ici, la methode save de IClientRepository qui extends de JpaRepository<Client,Long>  enregistre  dans la base et en plus retourne le  Client enregistrÃ©
		/*Client client2 = iClientRepository.save(new Client("amani","bouzbida""amani@ensi-uma.tn"));
		
	Client client3 = iClientRepository.save(new Client("latifa","mama""latifa@gmail.com"));*/

	réservation réservation1 = IréservationRepository.save(new réservation("","chakir",client1,null,5,4,null));
	//réservation réservation2 = IréservationRepository.save(new réservation("laoufaa","chakiir",null,"marwaa",6,4,null));
		


	}
	}