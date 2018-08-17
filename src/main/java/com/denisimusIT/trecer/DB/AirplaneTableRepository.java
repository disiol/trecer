package com.denisimusIT.trecer.DB;

import com.denisimusIT.trecer.Airplane;
import com.denisimusIT.trecer.AirplaneCharacteristics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AirplaneTableRepository extends MongoRepository<AirplaneTable, Long> {

    List<AirplaneTable> findByNameLike(AirplaneCharacteristics airplaneCharacteristics);

   // List<AirplaneTable> findByAirplaneCharacteristics_MaxSpeed(String maxSpeed);
}


