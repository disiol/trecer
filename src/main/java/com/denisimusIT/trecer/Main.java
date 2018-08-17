package com.denisimusIT.trecer;

import com.denisimusIT.trecer.DB.AirplaneTable;
import com.denisimusIT.trecer.DB.AirplaneTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class Main implements CommandLineRunner {

    private final AirplaneTableRepository repository;

    @Autowired
    public Main(AirplaneTableRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        AirplaneCharacteristics airplaneCharacteristics = new AirplaneCharacteristics(250L, 11L, 50L, 66L);
        TemporaryPoint position = new TemporaryPoint(25, 56, 140, 160, 64);
        Flight flight = new Flight(1L, new ArrayList<>(), new ArrayList<>());

        AirplaneTable airplaneTable = new AirplaneTable(2256L, airplaneCharacteristics.toString(), position.toString(), flight.toString());


        repository.deleteAll();

        repository.insert(airplaneTable);

    }
}
