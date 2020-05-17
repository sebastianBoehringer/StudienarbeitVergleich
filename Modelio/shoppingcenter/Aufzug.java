package ShoppingCenter;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import external.unlimitedNatural;

@objid ("fb1c8e96-704c-4d02-9de8-a2e8b0569b14")
public class Aufzug {
    @objid ("49ed133c-dd4c-4e59-ab11-05d156314c77")
    public int WeightLimit;

    @objid ("127c8879-2d80-4c47-b35a-ca25a442de39")
    public Etage CurrentFloor;

    @objid ("ec806a80-cee9-4738-9124-a34c43b187e3")
    public DoorState Door;

    @objid ("abb3a59e-43b4-47fe-bcac-cc7e7b657fd2")
    public List<Fahrgast> Passengers = new ArrayList<Fahrgast> ();

    @objid ("d6253063-1b7a-46fb-b4ac-7cf3dbefdb7f")
    public List<Fahrgast> moveUp(unlimitedNatural numberOfFloors) {
    }

    @objid ("271def97-e640-440a-9f4f-6e440d6c708f")
    public List<Fahrgast> moveDown(unlimitedNatural numberOfFloors) {
    }

    @objid ("d84d8037-aacf-4ed3-a05c-fcbf831947fe")
    public void openDoors() {
    }

    @objid ("f67f3169-ad7a-47fb-a189-a51f77692035")
    public void closeDoors() {
    }

}
