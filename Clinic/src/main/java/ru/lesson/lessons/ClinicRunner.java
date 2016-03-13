package ru.lesson.lessons;

import java.io.IOException;

/**
 * Работа клиники.
 */

public class ClinicRunner {

     public static void main(String[] args) throws IOException {

         /**
          * Создание нового объекта Клиника, заполнение клиентами и запуск меню.
          */
         Clinic clinic = new Clinic();
         clinic.addClient(new Client("Brown", new Cat("Digy")));
         clinic.addClient(new Client("Nick", new Dog("Recs")));
         clinic.addClient(new Client("Sem", new Cat("Tom")));
         clinic.go();
     }
}
