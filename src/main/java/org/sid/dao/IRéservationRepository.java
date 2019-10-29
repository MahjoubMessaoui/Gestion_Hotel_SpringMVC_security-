package org.sid.dao;
 

import org.sid.entities.Client;
import org.sid.entities.Operation;
import org.sid.entities.réservation;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;




public interface IRéservationRepository extends JpaRepository<réservation,Long>  {

	//@Query("select c from réservation c  where c.Adult=:x  ") 
	
	

	//public Page<réservation>  listOperation(@Param("x") Long idClient ,Pageable pageable);
	

	@Query("select r from réservation r where r.name=:x  ")  
	public réservation  getréservationParNom(@Param("x") String name);
	
	
	@Query("select r from réservation r where r.idre=:x  ")  
	public String  hi(@Param("x") long n);

	



}
