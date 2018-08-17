package com.denisimusIT.trecer;

import com.denisimusIT.trecer.DB.AirplaneTable;
import com.denisimusIT.trecer.DB.AirplaneTableRepository;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainTests {
    private final static String NEW_LINE = System.lineSeparator();

    @Autowired
    private AirplaneTableRepository repository;
    private TemporaryPoint position;
    private Flight flight;
    private AirplaneCharacteristics airplaneCharacteristics;

    @Before
    public void conf() {

    }


    @Test
    public void insertTest() {
        //before
        long id = 2256L;

        position = new TemporaryPoint(25, 56, 140, 160, 64);
        flight = new Flight(1L, new ArrayList<>(), new ArrayList<>());
        airplaneCharacteristics = new AirplaneCharacteristics(250L, 11L, 50L, 66L);
        AirplaneTable airplaneTable = new AirplaneTable(id, airplaneCharacteristics, position.toString(), flight.toString());

        repository.deleteAll();

        //then
        repository.insert(airplaneTable);

        String expected = "[AirplaneTable{id=2256, airplaneCharacteristics=AirplaneCharacteristics{maxSpeed=250, " +
                "maxAcceleration=11, speedChangeHeight=50, speedChangeCourse=66}, position=TemporaryPoint{width=25, longitude=56, " +
                "flightHeight=140, flightSpeed=160, course=64}, flight=Flight{number=1, coordinate=[], passedPoints=[]}}]";
        String actual = repository.findAll().toString();

        assertEquals(String.format("insertTest data: %s, %s, %s, %s",id,position.toString(),flight.toString(),airplaneCharacteristics.toString()), expected, actual);



    }
}
