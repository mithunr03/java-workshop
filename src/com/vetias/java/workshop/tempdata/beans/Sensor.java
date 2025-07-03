public class Sensor {
    private int sensorid;
    private String name;
    private double tempratureData;

    public Sensor(int sensorid, String name, double tempratureData) {
        this.sensorid = sensorid;
        this.name = name;
        this.tempratureData = tempratureData;
    }
    public int getSensorid() {
        return sensorid;
    }
    public void setSensorid(int sensorid) {
        this.sensorid = sensorid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getTempratureData() {
        return tempratureData;
    }
    public void setTempratureData(double tempratureData) {
        this.tempratureData = tempratureData;
    }
    
    
}
