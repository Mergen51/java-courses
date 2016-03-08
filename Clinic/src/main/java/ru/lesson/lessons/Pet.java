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
     * @return name.
     */
    String getName();
}
