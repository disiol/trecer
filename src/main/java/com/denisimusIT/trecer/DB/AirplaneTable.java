package com.denisimusIT.trecer.DB;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "airplane2")
public class AirplaneTable {


    @Id
    private Long id;

    private String airplaneCharacteristics;

    private String position;

    private String flight;

    public AirplaneTable() {
    }

    public AirplaneTable(Long id, String airplaneCharacteristics, String position, String flight) {
        this.id = id;
        this.airplaneCharacteristics = airplaneCharacteristics;
        this.position = position;
        this.flight = flight;
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
