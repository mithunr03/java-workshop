package com.vetias.java.workshop.tempdata.beans;
public class Zone {
    private String name;
    private int zoneId;
    private String Type;
    private double area;
    private int[] Sensor;

    public Zone(String name, int zoneId, String type, double area) {
        this.name = name;
        this.zoneId = zoneId;
        Type = type;
        this.area = area;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getZoneId() {
        return zoneId;
    }
    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }
    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setSensor(int sensor, int[] Sensor)
    {
        this.Sensor=Sensor;
        
    }
    @Override
    public String toString() {
        return "Zone{" +
                "name='" + name + '\'' +
                ", zoneId=" + zoneId +
                ", Type='" + Type + '\'' +
                ", area=" + area +
                ", Sensor=" + java.util.Arrays.toString(Sensor) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zone zone = (Zone) o;
        return zoneId == zone.zoneId &&
                Double.compare(zone.area, area) == 0 &&
                java.util.Objects.equals(name, zone.name) &&
                java.util.Objects.equals(Type, zone.Type) &&
                java.util.Arrays.equals(Sensor, zone.Sensor);
    }
    
    
}
