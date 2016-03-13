package ru.lesson.lessons;

/**
 * Описывает поведение питомца
 * Created by Mergen on 08.03.2016.
 */
public interface Pet {

    /**
     * Издавать звук.
     */
    void makeSound();

    /***
     * Имя питомца.
     */
    String getName();

    /**
     * Изменяет имя питомца
     * @param name имя.
     */
    void setName(String name);
}
