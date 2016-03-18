package ru.lesson.lessons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mergen on 17.03.2016.
 */
public class ClinicArrayListTest {

    ClinicArrayList<Integer> list;

    @Before
    public void createList() {
        list = new ClinicArrayList<Integer>();
        for (int i = 0; i < 7; i++) {
            list.add(i);
        }
    }

    @Test
    public void testIsEmpty() throws Exception {
        ClinicArrayList<String> array = new ClinicArrayList<String>();
        assertEquals(array.isEmpty(),true);
        array.add("String");
        assertFalse(array.isEmpty());
        array.clear();
        assertTrue(array.isEmpty());
    }


    @Test
    public void testGet() throws Exception {
        assertEquals(1, (int) list.get(1));
    }

    @Test
    public void testSet() throws Exception {
        list.set(2,2);
        assertEquals(2, (int) list.get(2));
    }

    @Test
    public void testClear() throws Exception {
        list.clear();
        assertTrue(list.isEmpty());

    }

    @Test
    public void testAdd() throws Exception {
        list.add(3,3);
        assertEquals(3, (int) list.get(3));
        assertEquals(8, list.size());

        list.clear();
        for (int i = 0; i < 30; i++){
            list.add(i);
        }
        assertEquals(30, list.size());
    }

    @Test
    public void testRemove() throws Exception {
        list.remove(0);
        assertEquals(1,(int) list.get(0));
        list.remove(0);
        assertEquals(2,(int) list.get(0));
    }

    @Test
    public void testRemove1() throws Exception {
        ClinicArrayList<String> array = new ClinicArrayList<String>();
        array.add("String");
        assertFalse(array.isEmpty());
        array.remove("String");
        assertTrue(array.isEmpty());
    }
}