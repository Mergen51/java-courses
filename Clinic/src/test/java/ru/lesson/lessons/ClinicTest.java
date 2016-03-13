package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mergen on 13.03.2016.
 */
public class ClinicTest {


    @Test
    public void testAddClient() throws Exception {
        Clinic clinic = new Clinic();
        clinic.addClient(new Client("Scot", new Cat("Pushok")));
        Assert.assertNotNull(clinic.findPetById("Scot"));
    }

    @Test
    public void testFindPetById() throws Exception {
        Clinic clinic = new Clinic();
        clinic.addClient(new Client("Sem", new Cat("Tom")));
        Assert.assertNotNull(clinic.findPetById("Sem"));
    }

    @Test
    public void testFindClientsByPetName() throws Exception {
        Clinic clinic = new Clinic();
        clinic.addClient(new Client("Brown", new Cat("Digy")));
        Assert.assertNotNull(clinic.findClientsByPetName("Digy"));
    }

    @Test
    public void testRemoveClient() throws Exception {
        Clinic clinic = new Clinic();
        clinic.addClient(new Client("Jon", new Dog("Jack")));
        clinic.removeClient("Jon");
        Assert.assertNull(clinic.findPetById("Jon"));
    }

    @Test
    public void testChangeNameClient() throws Exception {
        Clinic clinic = new Clinic();
        clinic.addClient(new Client("Nick", new Dog("Recs")));
        clinic.changeNameClient("Nick", "Nikolas");
        Assert.assertNotNull(clinic.findPetById("Nikolas"));
        Assert.assertNull(clinic.findPetById("Nick"));
    }

    @Test
    public void testChangeNamePet() throws Exception {
        Clinic clinic = new Clinic();
        clinic.addClient(new Client("Luis", new Dog("Suares")));
        clinic.changeNamePet("Suares", "Zevs");
        Assert.assertNotNull(clinic.findClientsByPetName("Zevs"));
        Assert.assertNull(clinic.findClientsByPetName("Suares"));
    }


}