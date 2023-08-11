package model;

import java.util.List;

public class Elevator {

    private List<Passenger> passengers;
    private final int MAX_CAPACITY = 5;
    private boolean isAvailableSpaces;
    private Floor maxFloor;

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public boolean isAvailableSpaces() {
        return isAvailableSpaces;
    }

    public void setAvailableSpaces(boolean availableSpaces) {
        isAvailableSpaces = availableSpaces;
    }

    public Floor getMaxFloor() {
        return maxFloor;
    }

    public void setMaxFloor(Floor maxFloor) {
        this.maxFloor = maxFloor;
    }
}
