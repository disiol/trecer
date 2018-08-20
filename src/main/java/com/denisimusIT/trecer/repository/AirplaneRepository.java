package com.denisimusIT.trecer.repository;

import com.denisimusIT.trecer.model.Airplane;
import com.denisimusIT.trecer.model.AirplaneCharacteristics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AirplaneRepository extends MongoRepository<Airplane,Long> {


    List<Airplane> findByNameLike(AirplaneCharacteristics airplaneCharacteristics);

    List<Airplane> findByAirplaneCharacteristics_MaxSpeed(String maxSpeed);
}


