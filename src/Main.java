import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Ramiz Perez","Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        int i = 0;
        int b = 2;
        b = i;
        //b=0

        System.out.println();
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
        System.out.println(patient2.getName());


        /*patient.setWeight(54.5);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());*/

    }
}
