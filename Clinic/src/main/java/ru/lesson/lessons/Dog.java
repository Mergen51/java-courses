package ru.lesson.lessons;

/**
 * Реализация собаки.
 */
 public class Dog implements Pet {

    /**
     * Имя питомца.
     */
    public String name;

    /**
     * Конструктор собаки
     * @param name имя
     */
    public Dog(String name) {
        this.name = name;
    }
     
    public void makeSound() {
        System.out.println("Gav, Gav!");
    }

    /**
     * Возвращает имя собаки
     * @return name имя.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Изменяет имя кота/кошки
     * @param name имя.
     */
    public void setName(String name) { this.name = name; }

    public String toString() {
        return "Собака";
    }
}