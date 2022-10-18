package carComponents;

import java.util.Objects;

public class Chassis extends CarComponent{

    private int passengerCapacity;
    private String chassisType;


    public Chassis(String name, double price, int installationTime, int chassisType) {
        super(name, price, installationTime);
        this.chassisType = ComponentTypes.CHASSIS.getType(chassisType);
        setPassengerCapacity();
    }

    public void setPassengerCapacity(){
        if(Objects.equals(this.chassisType, ComponentTypes.CHASSIS.getType(1))){
            this.passengerCapacity = 2;
        }else if (Objects.equals(this.chassisType, ComponentTypes.CHASSIS.getType(2))) {
            this.passengerCapacity = 4;
        } else if (Objects.equals(this.chassisType, ComponentTypes.CHASSIS.getType(3))){
            this.passengerCapacity = 6;
        }
    }


    public String getChassisType() {
        return this.chassisType;
    }

    public int getPassengerCapacity() {
        return this.passengerCapacity;
    }
}
