import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

public class Doctor {

    // Atributos
    static int id = 0; // Auto-Incrementado
    private String name;
    private String email;
    private String speciality;

    // Declarando el método constructor
    public Doctor(){
        System.out.println("Creando el objeto Doctor");
        id ++;
    }

    // Metodo constructor sobrecargado
    public Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
        System.out.println("Nombre del Dcotor asignado es: " + name);
        id++;
    }

    // Comportamientos
    // Imprime el nombre de la persona
    public void showName(){
        System.out.println(name);
    }
    //Imprime el ID del doctor;
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
    //Añade una cita
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }


    //Clases Anidada
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}
