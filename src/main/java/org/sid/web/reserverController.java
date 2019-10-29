package org.sid.web;


import org.sid.dao.IRéservationRepository;
import org.sid.entities.réservation;
import org.sid.metier.réserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class reserverController {

	 @Autowired
	private réserver reserver;
	 
		@RequestMapping(value ="save",method = RequestMethod.GET)
		public String newRegistration(ModelMap model) {
			réservation réservation = new réservation();
			model.addAttribute("réservation", réservation);
			return "/ind";
		}

}
