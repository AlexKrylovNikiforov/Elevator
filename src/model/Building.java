package model;

public class Building {

    private final int MAX_FLOOR;

    public Building(int max_floors) {
        MAX_FLOOR = max_floors;
    }

    public int getMaxFloor() {
        return MAX_FLOOR;
    }
}
