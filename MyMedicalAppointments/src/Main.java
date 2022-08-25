import model.AppointmentDoctor;
import model.Doctor;
import model.ISchedulable;
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

        User user = new User("Ana","ana@ana.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatría");
            }
        };

        user.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        ISchedulable iSchedulable1 = new AppointmentDoctor();

        //model.Patient patient = new model.Patient("Alejandra","alejandra@gmail.com");
        //System.out.println(patient);

    }
}
