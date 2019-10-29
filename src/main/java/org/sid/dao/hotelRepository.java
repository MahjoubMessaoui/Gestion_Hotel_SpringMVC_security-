package org.sid.dao;


import org.sid.entities.hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface hotelRepository extends JpaRepository<hotel,Long> {  //interface JPA/repository (utilisation de spring data necessite la creation de l'interface jpaRepository)  ---- le Id de Client est de type long
	
	 
}
