public class Temperaturesensor implements Sensor {
     private float temprature;
     public Temperaturesensor(float addTemprature){
        temprature=addTemprature;
     }
     @Override
     public float getReading()
     {
        return temprature;
     }
      

}
