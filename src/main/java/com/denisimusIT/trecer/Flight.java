package com.denisimusIT.trecer;

import java.util.List;

public class Flight {

    private Long number;

    private List<WayPoint> coordinate;

    private List<TemporaryPoint> passedPoints;

    public Flight(Long number, List<WayPoint> coordinate, List<TemporaryPoint> passedPoints) {
        this.number = number;
        this.coordinate = coordinate;
        this.passedPoints = passedPoints;
    }

    @Override
    public String toString() {
        return "Flight{number=" + number + ", coordinate=" + coordinate
                + ", passedPoints=" + passedPoints.toString() + "}";
    }
}
