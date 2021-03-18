package com.tts.myExoticCarShop.cadillac;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface CadillacRepository extends JpaRepository<Cadillac, Long>  {
	
	@Query("Select c FROM Cadillac c WHERE model = ?1")
	Optional<Cadillac> findCadillacBymodel(String model);


}
