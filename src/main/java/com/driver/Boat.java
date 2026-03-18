package com.driver;

public class Boat implements WaterVehicle{
    private String name="BlackBoat";
    private   int capacity=10;
    @Override
    public String getVehicleName()
        {
            return this.name;
        }
    @Override
    public int getVehicleCapacity()
    {
        return  this.capacity;
    }




}
