import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();

        Doctor doctor = new Doctor("Anahi", "Pediatria");
        System.out.println("doctor.name = " + doctor.name);
        System.out.println("doctor.speciality = " + doctor.speciality);

        Patient patient = new Patient("Felipe","email@hotmail.com");
    }
}
