package Repository;

import model.Building;

public class BuildingRepo {
    private final static int MAX_FLOORS = 21;
    private final Building currentBuilding;

    public BuildingRepo(Building currentBuilding) {
        this.currentBuilding = currentBuilding;
    }

    public Building addNewBuilding(int maxFloors) {
        return new Building(maxFloors);
    }

    public int getMaxFloor() {
        return this.currentBuilding.getMaxFloor();
    }
}
