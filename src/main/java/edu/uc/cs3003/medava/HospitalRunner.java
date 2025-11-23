package edu.uc.cs3003.medava;

public class HospitalRunner {
    
    /**
     * Simulates the supply chain operation.
     */
    public static void run() {
        // Initialize the transporter with specific temperature controls
        Transporter priorityDispatch = new Transporter("Priority Dispatch", 40.0, 41.0);

        // Initialize the pharmacy
        Pharmacy cvs = new Pharmacy("CVS at 7500 Beechmont Avenue");

        // Send goods
        cvs.send(priorityDispatch);

        // Initialize the hospital
        Hospital uc = new Hospital("World Famous University of Cincinnati Children's Hospital");

        // Receive goods
        uc.receive(priorityDispatch);
    }
}