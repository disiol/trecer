package com.denisimusIT.trecer;

import com.denisimusIT.trecer.model.Airplane;
import com.denisimusIT.trecer.repository.AirplaneRepository;
import com.denisimusIT.trecer.model.AirplaneCharacteristics;
import com.denisimusIT.trecer.model.Flight;
import com.denisimusIT.trecer.model.TemporaryPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = AirplaneRepository.class)
public class Main implements CommandLineRunner {

    @Autowired
    private final AirplaneRepository repository;

    public Main(AirplaneRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        AirplaneCharacteristics airplaneCharacteristics = new AirplaneCharacteristics(250L, 11L, 50L, 66L);
        TemporaryPoint position = new TemporaryPoint(25, 56, 140, 160, 64);
        Flight flight = new Flight(1L, new ArrayList<>(), new ArrayList<>());

        Airplane airplaneTable = new Airplane(2257L, airplaneCharacteristics, position, flight);


        repository.deleteAll();

        repository.insert(airplaneTable);

//        System.err.println(repository.findAirplaneCharacteristics(airplaneCharacteristics));


       // throw new Exception();







    }
}
