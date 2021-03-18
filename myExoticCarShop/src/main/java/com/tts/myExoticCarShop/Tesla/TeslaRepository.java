package com.tts.myExoticCarShop.Tesla;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;




@Repository
public interface TeslaRepository  extends JpaRepository<Tesla, Long> {
	
	@Query("Select t FROM Tesla t WHERE model = ?1")
	Optional<Tesla> findTeslaBymodel(String model);
	
	

}
