import model.Doctor;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();

        Doctor doctor = new Doctor("Anahi", "Pediatria");
        doctor.addAvailableAppointment(new Date(),"4pm");
        doctor.addAvailableAppointment(new Date(),"7am");

        //for(model.Doctor.AvailableAppointment i : doctor.getAvailableAppointments()){
        //    System.out.println(i.getDate());
        //    System.out.println(i.getTime());
        //}

        doctor.showDataUser();

        //model.Patient patient = new model.Patient("Alejandra","alejandra@gmail.com");
        //System.out.println(patient);

    }
}
