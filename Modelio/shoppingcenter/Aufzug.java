package ShoppingCenter;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import external.unlimitedNatural;

@objid ("6f592965-47ff-4784-a80b-ff5eab0e6f25")
public class Aufzug {
    @objid ("ae901a80-2841-4db3-a0ce-24e648ea9cf4")
    public int WeightLimit;

    @objid ("8dc3551a-07e3-47da-8348-b039169b436c")
    public Etage CurrentFloor;

    @objid ("0bb6ed74-59ff-4675-bf6f-b4a1d4e411a4")
    public DoorState Door;

    @objid ("91e259df-193c-4217-b361-707f5897ce61")
    public List<Fahrgast> Passengers = new ArrayList<Fahrgast> ();

    @objid ("426dd1c4-f2c5-4d91-abc6-49e49db669b9")
    public List<Fahrgast> moveUp(unlimitedNatural numberOfFloors) {
    }

    @objid ("b043bf17-a210-4301-8707-0a10d1653902")
    public List<Fahrgast> moveDown(unlimitedNatural numberOfFloors) {
    }

    @objid ("e3b266f4-c205-4f6d-8c39-09adf633aa38")
    public void openDoors() {
    }

    @objid ("a698a6a5-0f15-4dd1-b930-bb2617bedbd8")
    public void closeDoors() {
    }

}
