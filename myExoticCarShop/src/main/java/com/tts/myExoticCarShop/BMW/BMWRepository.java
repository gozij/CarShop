package com.tts.myExoticCarShop.BMW;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tts.myExoticCarShop.mercedez.Mercedez;


@Repository
public interface BMWRepository extends JpaRepository<BMW, Long> {
	
	@Query("Select b FROM BMW b WHERE model = ?1")
	Optional<BMW> findBMWBymodel(String model);

}


