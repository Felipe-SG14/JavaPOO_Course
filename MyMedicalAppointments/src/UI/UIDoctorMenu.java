package UI;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<Doctor>();
    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println("\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Scheduled Appointment");
            System.out.println("0. Logout");

            Scanner scanner = new Scanner(System.in);
            response = Integer.parseInt(scanner.nextLine());
            switch (response){
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        } while (response!=0);
    }

    private static void showAddAvailableAppointmentsMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println("::Add Available Appointment");
            System.out.println(":: Select Month");
            for (int i = 0; i < UIMenu.MONTHS.length; i++) {
                int j = i+1;
                System.out.println(j + ": " + UIMenu.MONTHS[i]);
            }
            System.out.println("0: Return");

            Scanner scanner = new Scanner(System.in);
            response = Integer.parseInt(scanner.nextLine());

            if (response > 0 && response < (UIMenu.MONTHS.length +1 )){
                int monthSelected = response;
                System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected-1]);

                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date  = scanner.nextLine();

                System.out.println("Your date is: " + date + "\n1. Correct \n2. Change Date");
                int responseDate = Integer.parseInt(scanner.nextLine());
                if (responseDate == 2) continue;

                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("Insert the time available for date: "+date+" [16:00]");
                    time = scanner.nextLine();
                    System.out.println("Your time is: "+time+"\n1. Correct \n2. Change Time");
                    responseTime = Integer.parseInt(scanner.nextLine());
                }while (responseTime == 2);

                UIMenu.doctorLogged.addAvailableAppointment(date,time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);

            } else if (response == 0) {
                showDoctorMenu();
            } else {
                System.out.println("Ingresa una opción correcta");
            }
        }while (response!=0);
    }


    private static void checkDoctorAvailableAppointments(Doctor doctor){
        if (doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);
        }
    }

}
