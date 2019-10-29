package org.sid.entities;

import java.io.Serializable;
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
@Table(name = "hotel")
public class hotel implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idhotel;
private String name;
private String catégorie ;
private Integer nbchambre ;
public Long getIdh() {
	return idhotel;
}
public void setIdh(Long idh) {
	this.idhotel = idh;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCatégorie() {
	return catégorie;
}
public void setCatégorie(String catégorie) {
	this.catégorie = catégorie;
}
public Integer getNbchambre() {
	return nbchambre;
}
public void setNbchambre(Integer nbchambre) {
	this.nbchambre = nbchambre;
}
public hotel() {
	super();
	// TODO Auto-generated constructor stub
}
@OneToMany(mappedBy="name")
private Set<hotel> hotel;
	
	
}