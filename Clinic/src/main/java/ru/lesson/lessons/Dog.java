package ru.lesson.lessons;

/**
 * Каласс Dog
 */
 public class Dog extends Animal implements Pet {

    /**
     * Базовая реализация питомца.
     */
    public String name;

    public Dog(String name) {
        this.name = name;
    }
     
    public void makeSound() {
        System.out.println("Gav, Gav!");
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Собака";
    }
}