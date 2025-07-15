package com.vetias.java.workshop.tempdata.beans;

import java.time.LocalDateTime;
import java.util.Map;

public interface Sensor {
    float getReading();
    Map<LocalDateTime, Float> getTemperatureReadings();
    void addReading(LocalDateTime time, float temperature);
}
