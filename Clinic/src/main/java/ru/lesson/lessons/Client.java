package ru.lesson.lessons;

/**
 * Класс клиент.
 */
class Client {
     private final String id;
     private final Pet pet;

     public Client(String id, Pet pet) {
          this.id = id;
          this.pet = pet;
     }


     public String getId() {
          return id;
     }

     public Pet getPet() {
          return pet;
     }

     public String toString() {
          return id + "-" + pet.toString() + " " + pet.getName();
     }

}