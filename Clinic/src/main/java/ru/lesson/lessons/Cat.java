package ru.lesson.lessons;

/**
 * Реализация кошки.
 */
 public class Cat extends Animal implements Pet {

    /**
     * Базовая реализация питомца.
     */
    public String name;

    public Cat (String name){
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Myau, Myau!");
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Кошка";
    }
}