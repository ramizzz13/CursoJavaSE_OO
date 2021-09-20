import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Ramiz Perez","Pediatria");
        myDoctor.addAvailableAppointment(new Date(), "4:00 PM");
        myDoctor.addAvailableAppointment(new Date(), "10:00 AM");
        myDoctor.addAvailableAppointment(new Date(), "1:00 PM");

        for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }


        /*System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        Patient patient2 = new Patient("Anahí", "anahi@gmail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());*/


        /*patient.setWeight(54.5);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());*/

    }
}
