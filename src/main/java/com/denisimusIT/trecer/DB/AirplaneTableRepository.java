package com.denisimusIT.trecer.DB;

import com.denisimusIT.trecer.Airplane;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;
import java.util.List;

public interface AirplaneTableRepository extends MongoRepository<AirplaneTable, Long> {

    public AirplaneTable findByEmpNo(String airplaneCharacteristics);

    public List<AirplaneTable> findByFullNameLike(String airplaneCharacteristics);

    //  List<AirplaneTable> findByHireDateGreaterThan(Date hireDate);

    // Supports native JSON query string
//    @Query("{fullName:'?0'}")
//    List<AirplaneTable> findCustomByFullName(String fullName);


}