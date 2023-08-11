package Repository;

import model.Passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerRepo {
    private List<Passenger> passengers = new ArrayList<>();

    private Passenger createNewPassenger(int id) {
        return new Passenger(id);
    }

    public List<Passenger> getPassengersList() {
        return passengers;
    }

    public void createPassengerList(int maxFloor) {
        for (int i = 0; i < 10; i++) {
            Passenger newPassenger = createNewPassenger(i);
            newPassenger.setNeededFloor((int) Math.random() * ++maxFloor);
            passengers.add(newPassenger);
        }
    }
}
