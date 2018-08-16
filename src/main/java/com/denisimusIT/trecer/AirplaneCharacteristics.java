package com.denisimusIT.trecer;

public class AirplaneCharacteristics {
    private  Long maxSpeed;
    private  Long maxAcceleration;
    private  Long speedChangeHeight;
    private  Long speedChangeCourse;



    public AirplaneCharacteristics(int maxSpeed, int maxAcceleration, int speedChangeHeight, int speedChangeCourse) {
        this.maxSpeed = Long.valueOf(maxSpeed);
        this.maxAcceleration = Long.valueOf(maxAcceleration);
        this.speedChangeHeight = Long.valueOf(speedChangeHeight);
        this.speedChangeCourse = Long.valueOf(speedChangeCourse);
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
