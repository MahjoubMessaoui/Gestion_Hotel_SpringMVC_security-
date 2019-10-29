package org.sid.metier;

import org.sid.entities.réservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class réserver {

	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	
	
	public void enregistrer(réservation r) {
		String sql ="insert into réservation(Name,phone,Email,date_in,date_out,adult,chlidren,note) values('"+r.getName()+"','"+r.getPhone()+"','"+r.getMail()+"','"+r.getDate_in()+"','"+r.getDate_out()+"','"+r.getAdult()+"','"+r.getChildren()+"','"+r.getNotes()+"')";
		System.out.println(sql);
	     template.update(sql);  
	}
		
		
		
		

		
	}

