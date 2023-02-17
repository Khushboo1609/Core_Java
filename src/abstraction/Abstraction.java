package abstraction;

import org.w3c.dom.ls.LSOutput;

class Car{
    private String car;
    private String engineType;

    public String getCar() {
        return car;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    Car(String carName){
        this.car=carName;
        this.engineType="Engine with mileage 50km";
    }

    public void setCar(String car) {
        this.car = car;
    }


}


public class Abstraction {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car nano = new Car("NANO");
        nano.setEngineType("Engine with mileage 80km");
        System.out.println(nano.getEngineType());
    }


}
