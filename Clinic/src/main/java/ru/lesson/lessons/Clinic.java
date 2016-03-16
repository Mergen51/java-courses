package ru.lesson.lessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс описывает клинику.
 */
public class Clinic {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Список клиентов.
     */
    public List<Client> clients;
    public Clinic() {
        this.clients = new ClinicArrayList<Client>();
    }


    /**
     * Добавляет Клиента.
     * @param client клиент
     */
    public void addClient(final Client client) {
        clients.add(client);
    }

    /**
     * Ищет питомца по имени клиета.
     * @param id имя клиента.
     */
    public Client findPetById(final String id) {
        Client client = null;
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId().equals(id)) {
                client = clients.get(i);
            }
        }
        return client;
    }

    /**
     * Ищет клиета по имени питомца.
     * @param petName имя питомца.
     */
    public Client findClientsByPetName(final String petName) {
        Client client = null;
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getPet().getName().equals(petName)) {
                client = clients.get(i);
            }
        }
        return client;
    }

    /**
     * Метод удаляет клиента из клиники.
     * @param id имя Клиента.
     */
    public void removeClient(final String id) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId().equals(id)) {
                clients.remove(clients.get(i));
                System.out.println("Клиент удален.");
                i += 1;
            }
        }
    }

    /**
     * Метод меняет имя клиента.
     * @param id,newId старое и новое имz клиента.
     */
    public void changeNameClient(final String id, final String newId) {
        for (int i = 0;i < clients.size(); i++) {
            if (clients.get(i).getId().equals(id)) {
                clients.add(new Client(newId, clients.get(i).getPet()));
                clients.remove(i);
            }
        }
    }

    /**
     * Метод меняет имя питомца.
     * @param namePet,newNamePet старое и новое имz питомца.
     */
    public void changeNamePet(final String namePet, final String newNamePet) {
        for (int i = 0;i < clients.size(); i++) {
            if (clients.get(i).getPet().getName().equals(namePet)) {
                clients.get(i).getPet().setName(newNamePet);
            }
        }
    }

    /**
     * Выводит всех клиетов и их питомцев в клинике.
     */
    public void printClientAndPet() {
        if (this.clients.isEmpty()) {
            System.out.println("");
        }
        for (int i = 0; i < clients.size();i++ ) {
            System.out.println(clients.get(i).toString());
        }
    }

    /**
     * Вывод на экран пунктов меню
     */
    public void menu() {
        System.out.println("*********Меню клиники**********");
        System.out.println("Введите номер действия:");
        System.out.println("1.Добавить нового клиента");
        System.out.println("2.Поиск питомца по имени клиент");
        System.out.println("3.Поиск клиента по имени питомца");
        System.out.println("4.Удалить Клиента, питомца");
        System.out.println("5.Изменить имя клиента");
        System.out.println("6.Изменить имя питомца");
        System.out.println("7.Вывкести всех кслиентов клиники");
        System.out.println("8.Выход из программы");
    }

    public void soutId() {
        System.out.println("Введите имя клиента:");
    }

    public void soutPetName() {
        System.out.println("Введите имя питомца:");
    }


    /**
     *Метод получает команды от пользователя, пока пользователь не введет цифру 8(выход из программы).
     */
    public void go() throws IOException {
        String exit = "no";
        menu();
        while (!"yes".equals(exit)) {
            try {
                int namb = Integer.parseInt(reader.readLine());
                if (0 < namb & namb < 9) {
                    switch (namb) {
                        case 1:
                            soutId();
                            String id = reader.readLine();
                            soutPetName();
                            String pedName = reader.readLine();
                            addClient(new Client(id, new Dog(pedName)));
                            System.out.println("Клиент добавлен.");
                            break;
                        case 2:
                            soutId();
                            String id2 = reader.readLine();
                            if (findPetById(id2)!=null) {
                                System.out.println("Найден клиент: " + findPetById(id2));
                            } else System.out.println("Питомец не найден");
                            break;
                        case 3:
                            soutPetName();
                            String petName2 = reader.readLine();
                            if (findClientsByPetName(petName2)!=null) {
                                System.out.println("Клиентк найден: " + findClientsByPetName(petName2));
                            } else System.out.println("Клиент не найден");
                            break;
                        case 4:
                            soutId();
                            String id4 = reader.readLine();
                            removeClient(id4);
                            break;
                        case 5:
                            soutId();
                            String id5 = reader.readLine();
                            System.out.println("Введите новое имя клиента:");
                            String id6 =reader.readLine();
                            changeNameClient(id5, id6);
                            System.out.println("Имя изменено");
                            break;
                        case 6:
                            soutPetName();
                            String petName3 = reader.readLine();
                            System.out.println("Введите новое имя питомца:");
                            String newPetName = reader.readLine();
                            changeNamePet(petName3, newPetName);
                            System.out.println("Имя изменено");
                            break;
                        case 7:
                            printClientAndPet();
                            break;
                        case 8:
                            System.out.println("До свидания.");
                            exit = "yes";
                            break;
                    }
                } else System.out.println("Число должно быть от 1 до 8.");
            } catch (NumberFormatException e) {
                System.out.println("Введите число.");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        reader.close();
    }
}

