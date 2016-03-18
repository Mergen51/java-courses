package ru.lesson.lessons;


import java.util.*;

/**
 * Created by Mergen on 16.03.2016.
 */
public class ClinicArrayList<E> extends AbstractList<E> implements List<E> {

    /**
     *Начальная емкость массива
     */
    private static final int initialCapacity = 10;

    /**
     * Шаг увеличения массива
     */
    private static final int increasingStep = 10;

    /**
     *Количество элемнтов в массиве
     */
    private int size;

    /**
     *Массив
     */
    private E [] clinicArray;

    /**
     * Конструктор
     */
    public ClinicArrayList() {
        create();
    }

    /**
     * Создание массива
     */
    private void create() {
        this.clinicArray = (E[])new Object[initialCapacity];
    }

    /**
     *Возвращает размер списка
     * @return размер
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Проверяет список на отсутствиэ элементов
     * @return true если разер равен 0.
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * возвращает элемент массива по  индексу
     * @param index индекс
     * @return элемент массива
     */
    @Override
    public E get(int index) {
        checkIndex(index);
        return this.clinicArray[index];
    }

    /**
     *Замена элемена массива по индексу на новый
     * @param index индекс
     * @param element новый элемент
     * @return старый элемент
     */
    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E old = clinicArray[index];
        this.clinicArray[index] = element;
        return old;
    }

    /**
     * Удаляет все элементы из коллекции
     */
    @Override
    public void clear() {
        create();
        this.size = 0;
    }

    /**
     * Добавление нового элемента в массив
     * @param e новый элемент
     * @return успешность добовления элемента
     */
    @Override
    public boolean add(E e) {
        checkSize();
        clinicArray[this.size++] = e;
        return true;
    }

    /**
     *Удалить обьект из списка
     * @param o обьект
     * @return успешность удаления
     */
    public boolean remove(Object o) {
        if (o == null) {
            for (int index = 0; index < size; index++)
                if (clinicArray[index] == null) {
                    fastRemove(index);
                    return true;
                }
        } else {
            for (int index = 0; index < size; index++)
                if (o.equals(clinicArray[index])) {
                    fastRemove(index);
                    return true;
                }
        }
        return false;
    }

    /**
     *Удалить обьект из списка по иедексу
     * @param index индекс
     * @return удаленный обьект
     */
    public E remove(int index) {
        checkIndex(index);
        E oldValue = this.clinicArray[index];
        int numMoved = this.size - index - 1;
        if (numMoved > 0)
            System.arraycopy(clinicArray,index+1,clinicArray,index,numMoved);
        clinicArray[--size] = null;
        return oldValue;
    }

    /**
     *Проверка индекса
     * Индекс должен быть больше 0, но меньше размера массива
     * @param index индекс
     */
    private void checkIndex(int index) {
        if (index > this.size || index < 0 || this.size() == 0) {
            throw new IndexOutOfBoundsException("Wrong index: " + index);
        }
    }

    private void checkSize() {
        if (this.size + 1> this.clinicArray.length) {
            E[] array = (E[]) new Object[this.size + increasingStep];
            System.arraycopy(this.clinicArray, 0, array, 0, this.size);
            this.clinicArray = array;

        }
    }

    private void fastRemove(int index) {
        checkIndex(index);
        int numMoved = this.size - index - 1;
        if (numMoved > 0)
            System.arraycopy(clinicArray,index+1,clinicArray,index,numMoved);
        clinicArray[--size] = null;
    }



    /**
     * Добавление нового элента списка по индексу
     * @param index индекс
     * @param element Елемент
     */
    public void add(int index, E element) {
        checkIndex(index);
        E[] array = (E[])new Object[this.size + 1];
        System.arraycopy(this.clinicArray,0,array,0,index);
        array[index] = element;
        System.arraycopy(this.clinicArray,index,array,index+1,this.size - index);
        this.clinicArray = array;
        this.size++;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    public ListIterator<E> listIterator(int index) {
        return null;
    }

    public ListIterator<E> listIterator() {
        return null;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator<E> iterator() {
        return null;
    }
}
