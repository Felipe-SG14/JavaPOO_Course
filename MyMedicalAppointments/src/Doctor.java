import javax.print.Doc;

public class Doctor {

    // Atributos
    static int id = 0; // Auto-Incrementado
    String name;
    String speciality;

    // Declarando el método constructor
    public Doctor(){
        System.out.println("Creando el objeto Doctor");
        id ++;
    }

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

}
