package com.denisimusIT.trecer;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


public class Airplane {
    private Long id;

    private String airplaneCharacteristics;
    private TemporaryPoint position;
    private String flight;

    public Airplane() {

    }

    public Airplane(Long id, String airplaneCharacteristics, TemporaryPoint position, Flight flight) {
        this.id = id;
        this.airplaneCharacteristics = airplaneCharacteristics;
        this.position = position;
        this.flight = flight.toString();
    }


    public Long getId() {
        return id;
    }

    public String getAirplaneCharacteristics() {
        return airplaneCharacteristics;
    }

    public TemporaryPoint getPosition() {
        return position;
    }

    public String getFlight() {
        return flight;
    }



    @Override
    public String toString() {
        return "AirplaneTable{" +
                "id=" + id +
                ", airplaneCharacteristics=" + airplaneCharacteristics +
                ", position=" + position +
                ", flight=" + flight +
                '}';
    }


}
