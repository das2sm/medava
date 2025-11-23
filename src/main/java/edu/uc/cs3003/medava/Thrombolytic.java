package edu.uc.cs3003.medava;

public class Thrombolytic extends Medicine {

    public Thrombolytic() {
        super("Thrombolytic");
    }

    @Override
    public double minimumTemperature() {
        System.out.print("Getting the minimum safe temperature for a Thrombolytic drug.\n");
        return 39.2;
    }

    @Override
    public double maximumTemperature() {
        System.out.print("Getting the maximum safe temperature for a Thrombolytic drug.\n");
        return 41.0;
    }

    @Override
    public MedicineSchedule getSchedule() {
        return MedicineSchedule.Uncontrolled;
    }
}