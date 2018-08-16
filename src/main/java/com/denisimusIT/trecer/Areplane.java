package com.denisimusIT.trecer;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Areplane")
public class Areplane {

    @Id
    private Long id;

    private String airplaneCharacteristics;

    private String position;

    private String flight;

    public Areplane(String airplaneCharacteristics, String position, String flight) {
        this.airplaneCharacteristics = airplaneCharacteristics;
        this.position = position;
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Areplane{" +
                "id=" + id +
                ", airplaneCharacteristics='" + airplaneCharacteristics + '\'' +
                ", position='" + position + '\'' +
                ", flight='" + flight + '\'' +
                '}';
    }
}
