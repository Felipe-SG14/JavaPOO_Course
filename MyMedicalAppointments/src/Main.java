import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();

        Doctor doctor = new Doctor("Anahi", "Pediatria");
        System.out.println("doctor.name = " + doctor.name);
        System.out.println("doctor.speciality = " + doctor.speciality);

        Patient patient = new Patient("Felipe","email@hotmail.com");
        patient.setWeight(54.6);
        System.out.println("patient.getWeight() = " + patient.getWeight());

        patient.setPhoneNumber("123456789");
    }
}
