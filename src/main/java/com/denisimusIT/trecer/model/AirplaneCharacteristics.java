package com.denisimusIT.trecer.model;

public class AirplaneCharacteristics {
    private Long maxSpeed;
    private Long maxAcceleration;
    private Long speedChangeHeight;
    private Long speedChangeCourse;

    public AirplaneCharacteristics(Long maxSpeed, Long maxAcceleration, Long speedChangeHeight, Long speedChangeCourse) {
        this.maxSpeed = maxSpeed;
        this.maxAcceleration = maxAcceleration;
        this.speedChangeHeight = speedChangeHeight;
        this.speedChangeCourse = speedChangeCourse;
    }

    public Long getMaxSpeed() {
        return maxSpeed;
    }

    public Long getMaxAcceleration() {
        return maxAcceleration;
    }

    public Long getSpeedChangeHeight() {
        return speedChangeHeight;
    }

    public Long getSpeedChangeCourse() {
        return speedChangeCourse;
    }

    @Override
    public String toString() {
        return "AirplaneCharacteristics{" +
                "maxSpeed=" + maxSpeed +
                ", maxAcceleration=" + maxAcceleration +
                ", speedChangeHeight=" + speedChangeHeight +
                ", speedChangeCourse=" + speedChangeCourse +
                '}';
    }
}
