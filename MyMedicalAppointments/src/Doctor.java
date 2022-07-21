import javax.print.Doc;

public class Doctor {

    // Atributos
    int id;
    String name;
    String speciality;

    // Declarando el método constructor
    public Doctor(){
        System.out.println("Creando el objeto Doctor");
    }

    public Doctor(String name){
        this.name = name;
    }


    // Comportamientos
    // Imprime el nombre de la persona
    public void showName(){
        System.out.println(name);
    }

}
