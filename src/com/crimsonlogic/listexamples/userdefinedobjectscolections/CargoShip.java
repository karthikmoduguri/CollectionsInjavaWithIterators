package com.crimsonlogic.listexamples.userdefinedobjectscolections;

import java.util.Objects;

public class CargoShip {


    private int cargoShip;
    private String cargoShipName;

    private float cargoShipCapacity;
    public int getCargoShip() {
        return cargoShip;
    }

    public void setCargoShip(int cargoShip) {
        this.cargoShip = cargoShip;
    }

    public String getCargoShipName() {
        return cargoShipName;
    }

    public void setCargoShipName(String cargoShipName) {
        this.cargoShipName = cargoShipName;
    }

    public float getCargoShipCapacity() {
        return cargoShipCapacity;
    }

    public void setCargoShipCapacity(float cargoShipCapacity) {
        this.cargoShipCapacity = cargoShipCapacity;
    }

    @Override
    public String toString() {
        return "CargoShip{" +
                "cargoShip=" + cargoShip +
                ", cargoShipName='" + cargoShipName + '\'' +
                ", cargoShipCapacity=" + cargoShipCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CargoShip cargoShip1 = (CargoShip) o;
        return cargoShip == cargoShip1.cargoShip && Float.compare(cargoShipCapacity, cargoShip1.cargoShipCapacity) == 0 && Objects.equals(cargoShipName, cargoShip1.cargoShipName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cargoShip, cargoShipName, cargoShipCapacity);
    }
}
