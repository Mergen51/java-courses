package ru.lesson.lessons;

/**
 * Реализация кошки.
 */
 public class Cat implements Pet {

    /**
     * Имя питомца.
     */
    public String name;

    /**
     * Конструктор кота/кошки
     * @param name имя
     */
    public Cat (String name){
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Myau, Myau!");
    }

    /**
     * Возвращает имя кота/кошки
     * @return name имя.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Изменяет имя кота/кошки
     * @param name имя.
     */
    public void setName (String name) { this.name = name; }


    public String toString() { return "Кот/кошка"; }
}