package edu.uc.cs3003.medava;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Hospital {

    private String name;

    public Hospital(String hospitalName) {
        name = hospitalName;
    }

    /**
     * Receives shipments from a transporter.
     * Note: Reflection-based implementation is preserved in comments for reference.
     */
    void receive(Transporter t) {
        while (!t.isEmpty()) {
            Shippable unloaded = t.unload();
            System.out.printf("Checking whether Hospital can receive %s.\n", unloaded.getMedicineName());
            
            if (unloaded.getSchedule() != MedicineSchedule.Uncontrolled) {
                System.out.printf("Hospital cannot receive controlled substances and %s is a %s.\n",
                        unloaded.getMedicineName(), unloaded.getSchedule().asString());
            } else {
                System.out.printf("Accepted a shipment of %s.\n", unloaded.getMedicineName());
            }
        }
    }

    public String name() {
        return name;
    }
}