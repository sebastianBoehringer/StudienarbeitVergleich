package ShoppingCenter;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("bfe45e07-fccd-455c-8d3f-f01b9445c7c9")
public class Etage {
    @objid ("fd80e45b-e0c7-407e-95b9-b9d4dfb4bdec")
    public int Number;

    @objid ("e530a505-65a0-4e14-985f-02b72c027f57")
    public String Name;

    @objid ("1b7628d2-a45a-4bc9-9510-4f196b4ac19d")
    public Etage Next;

    @objid ("42a89632-2391-423f-9021-23475e572fd0")
    public Etage Previous;

}
