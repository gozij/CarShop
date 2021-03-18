package com.tts.myExoticCarShop.mercedez;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;




@Repository
public interface MercedezRepository extends JpaRepository<Mercedez, Long> {
	
	@Query("Select m FROM Mercedez m WHERE model = ?1")
	Optional<Mercedez> findMercedezBymodel(String model);

}
