package org.sid.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity; //importer pour la persistance (pour pouvoir utiliser les annotations des entity)
import javax.persistence.FetchType;
import javax.persistence.Table; //pour l'annotation des tables ( @Table )
import javax.persistence.Id; //pour @Id
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

//les annotations JPA sont : @Entity , @Table, @Id, @GeneratedValue , @Inheritance ,@ManyToOne , @ManyToMany , ....


@Entity
@Table(name = "Clients")
public class Client implements Serializable {
	@Id
	@GeneratedValue
	private Long idClient;
	private String nomClient;
	private String prenomClient;
	private String adresseClient;
	
	public Client(String nom,String prénom,String adress)
	{
		this.nomClient=nom;
		this.prenomClient=prénom;
		this.adresseClient=adress;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public String getAdresseClient() {
		return adresseClient;
	}
	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Set<réservation> getRéservation() {
		return réservation;
	}
	public void setRéservation(Set<réservation> réservation) {
		this.réservation = réservation;
	}
	private long phone;
	@OneToMany(mappedBy="idre")
	private Set<réservation> réservation;
	

 
}
