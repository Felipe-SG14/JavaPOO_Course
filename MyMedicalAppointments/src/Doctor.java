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

    public Doctor(String name){
        System.out.println("Nombre del Dcotor asignado es: " + name);
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
