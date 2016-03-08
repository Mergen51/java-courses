package ru.lesson.lessons;
/**
 * Работа клиники.
 */

public class ClinicRunner {
     
     public static void main(String[] args) {

          Clinic clinic = new Clinic();

         clinic.addClient(new Client("Brown", new Cat("Digy")));
         clinic.addClient(new Client("Nick", new Dog("Recs")));
         clinic.addClient(new Client("Sem", new Cat("Tom")));

         for (int i = 0; i < clinic.clientCount - 1; i++) {
             System.out.println(clinic.getClientAndPet(i).toString());
         }

     }
}