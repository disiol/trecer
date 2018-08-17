package com.denisimusIT.trecer.DB;

import com.denisimusIT.trecer.AirplaneCharacteristics;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "airplane")
public class AirplaneTable {


    @Id
    private Long id;

    @Field(value = "airplaneCharacteristics")
    private AirplaneCharacteristics airplaneCharacteristics;

    private String position;

    private String flight;

    public AirplaneTable() {
    }

    public AirplaneTable(Long id, AirplaneCharacteristics airplaneCharacteristics, String position, String flight) {
        this.id = id;
        this.airplaneCharacteristics = airplaneCharacteristics;
        this.position = position;
        this.flight = flight;
    }



    public Long getId() {
        return id;
    }

    public String getAirplaneCharacteristics() {
        return airplaneCharacteristics.toString();
    }

    public String getPosition() {
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
