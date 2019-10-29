package org.sid.web;
 
import org.sid.entities.Client;
import org.sid.entities.Operation;
import org.sid.entities.réservation;
import org.sid.metier.IhotelMetier;
import org.sid.metier.IréservationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hotelController {    //ceci est un controlleur Spring MVC

 //la couche web a besoin de la couche metier --> d'où
	@Autowired
	private IhotelMetier ihotelMetier;
	
	/*@RequestMapping("/operations")  //càd , quand je tape : localhost/operations j'aurai une vue qui s'appelle comptes.html
	public String index() {   //cette methode retourne une vue tous simplement
		 return "comptes"; //càd : le nom de la vue est : comptes.html
	 }*/
	
	@RequestMapping(value="/ind")
	public String viewHome() {
	    return "accueil";
	}
	@RequestMapping(value="/Admin")
	public String viewAdmin() {
	    return "Client";
	}
	@RequestMapping(value="/Admii")
	public String viewAdmi() {
	    return "réservation";
	}
	@RequestMapping(value="/Admiii")
	public String viewAdmii() {
	    return "hotel";
	}
	/*@RequestMapping(value="/login")
	public String viewAdmin1() {
	    return "Client";*/
	
	@RequestMapping("/consulterClient") 
	public String consulterclient(Model model, int idClient, @RequestParam(name="page",defaultValue="0")int page,@RequestParam(name="size",defaultValue="5")int size) { 
		
		try {
			
			Client client = ihotelMetier.getClient((long) idClient);
			model.addAttribute("client",client);
			
	 
		}catch (Exception e) {
			model.addAttribute("exception",e);
		}
		return "Client";
	}
	//consulter une réservation
	

	
	}
	
	


