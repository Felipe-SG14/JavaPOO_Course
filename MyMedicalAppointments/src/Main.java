import java.util.Date;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();

        Doctor doctor = new Doctor("Anahi", "Pediatria");

        doctor.addAvailableAppointment(new Date(),"4pm");
        doctor.addAvailableAppointment(new Date(),"7am");

        for(Doctor.AvailableAppointment i : doctor.getAvailableAppointments()){
            System.out.println(i.getDate());
            System.out.println(i.getTime());
        }

    }
}
