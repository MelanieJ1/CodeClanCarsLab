package carComponents;

import java.util.Objects;

public class Engine extends CarComponent{

    private String fuelType;
    private int capacity;
    private int horsepower;

    private String engineType;

    public Engine(String name, double price, int installationTime, int horsepower, int engineType) {
        super(name, price, installationTime);
        this.capacity = 100;
        this.horsepower = horsepower;
        this.engineType = ComponentTypes.ENGINE.getType(engineType);
        setFuelType();
    }

    public void setFuelType(){
        if(Objects.equals(this.engineType, ComponentTypes.ENGINE.getType(1))){
            this.fuelType = "Petrol";
        }else if (Objects.equals(this.engineType, ComponentTypes.ENGINE.getType(2))) {
            this.fuelType = "Petrol/Electricity";
        } else if (Objects.equals(this.engineType, ComponentTypes.ENGINE.getType(3))){
            this.fuelType = "Electricity";
        }
    }


    public String getEngineType() {
        return this.engineType;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getCapacity() {
        return capacity;
    }
}
