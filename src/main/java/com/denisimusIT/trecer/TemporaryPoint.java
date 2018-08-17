package com.denisimusIT.trecer;

public class TemporaryPoint {

    private Integer width;

    private Integer longitude;

    private Integer flightHeight;

    private Integer flightSpeed;

    private Integer course;

    public TemporaryPoint(Integer width, Integer longitude, Integer flightHeight, Integer flightSpeed, Integer course) {
        this.width = width;
        this.longitude = longitude;
        this.flightHeight = flightHeight;
        this.flightSpeed = flightSpeed;
        this.course = course;
    }

    @Override
    public String toString() {
        return "TemporaryPoint{" +
                "width=" + width +
                ", longitude=" + longitude +
                ", flightHeight=" + flightHeight +
                ", flightSpeed=" + flightSpeed +
                ", course=" + course +
                '}';
    }
}
