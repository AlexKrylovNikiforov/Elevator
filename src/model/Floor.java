package model;

import java.util.List;

public class Floor {
    private final int MAX_PASSENGERS = 10;
    private List<Passenger> currentPassengers;
    private boolean isFloorEmpty;


    public List<Passenger> getCurrentPassengers() {
        return currentPassengers;
    }

    public void setCurrentPassengers(List<Passenger> currentPassengers) {
        this.currentPassengers = currentPassengers;
    }

    public boolean isFloorEmpty() {
        return currentPassengers.isEmpty();
    }
}

