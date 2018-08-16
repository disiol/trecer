package com.denisimusIT.trecer;

import com.denisimusIT.trecer.DB.AirplaneTable;
import com.denisimusIT.trecer.DB.AirplaneTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrecerApplication implements CommandLineRunner {

	@Autowired
	private AirplaneTableRepository repository;

	private AirplaneCharacteristics airplaneCharacteristics;
	private TemporaryPoint position;
	private Flight flight;




	public static void main(String[] args) {
		SpringApplication.run(TrecerApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

    airplaneCharacteristics = new AirplaneCharacteristics(250,11,50,66);
    position = new TemporaryPoint(25,56,140,160,64);

		repository.deleteAll();

		repository.insert(new AirplaneTable((long) 2256,airplaneCharacteristics.toString(),position.toString(),flight.toString()));




	}
}
