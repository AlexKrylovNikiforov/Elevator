package model;

public class Passenger {

    private final int id;
    private int neededFloor;
    private int currentFloor;

    public Passenger(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public int getNeededFloor() {
        return neededFloor;
    }

    public void setNeededFloor(int neededFloor) {
        this.neededFloor = neededFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }
}
