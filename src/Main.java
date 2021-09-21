import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Ramiz Perez","ramiz@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4:00 PM");
        myDoctor.addAvailableAppointment(new Date(), "10:00 AM");
        myDoctor.addAvailableAppointment(new Date(), "1:00 PM");

        System.out.println(myDoctor);

        User user = new Doctor("Kristal", "kris@gmail.com") ;

       /* for (model.Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }*/


        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        Patient patient2 = new Patient("Anahí", "anahi@gmail.com");
        System.out.println(patient);
        System.out.println(patient2);
    }
}
