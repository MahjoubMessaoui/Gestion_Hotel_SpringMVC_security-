package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.jdbc.core.JdbcTemplate;

 



@Entity
//Puisque je n'utiliserai pas l'annotation @Table --> la table dans la base de donn�e (l'entity) sera cr�er avec le nom de la classe $qui est Compte$( et c'est la valeur par defaut)
 @Table(name="réservation") //: on ne va pas utiliser cette annotation (car on a h�ritage) --> un compte peut etre un compte courant ou un compte epargne

public class réservation implements Serializable{
	@Id
	@GeneratedValue//: le code est string donc not auto increment


	private Long idre;
public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	
	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}

	public Integer getAdult() {
		return Adult;
	}

	public void setAdult(Integer adult) {
		Adult = adult;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	//attributs normales
	
	/*private Date dateCreation;*/
	private String name ;
	private Long phone ;
	private String mail;
  private Date date_in ;
	private Date date_out;
	public Date getDate_in() {
		return date_in;
	}



	public void setDate_in(Date date_in) {
		this.date_in = date_in;
	}



	public Date getDate_out() {
		return date_out;
	}



	public void setDate_out(Date date_out) {
		this.date_out = date_out;
	}

	private Integer children ;
	private Integer Adult ;
	private String notes;

//attributs d'association
	

	private Client client;
	
   //une réservation  appartient  à un client
 
	public réservation(String name, String note,Client client1,String mail,Integer adulte,Integer children,Client client) {
		this.name = name;
		this.notes = note;
		this.Adult=adulte;
		this.children=children;
		this.mail=mail;
		
		this.phone=phone;
		
	}

	public réservation() {
		super();// TODO Auto-generated constructor stub
	}


	public Long getIdre() {
		return idre;
	}

	public void setIdre(Long idre) {
		this.idre = idre;
	}

	
	

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}


}
