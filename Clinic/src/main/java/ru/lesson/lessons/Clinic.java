package ru.lesson.lessons;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс описывает клинику.
 */
public class Clinic {

    /**
     * Количество клиентов в клинеке
     */
    public int clientCount;

     /**
      * Список клиентов.
      */
     public List<Client> clients;

     public Clinic() {
          this.clients = new ArrayList<Client>();
     }

     /**
      * Метод возвращает количество клиентов в клинеке
      */
     public int getClientCount() {
          return clientCount = clients.size();
     }

     /**
      * Добавляет Клиента.
      *@param client клиент
      */
     public void addClient(Client client) {
          clients.add(client);
     }

     /**
      * Ищет клиета по имени питомца.
      *@param petName имя питомца.
      */
     public Client findClientsByPetName(final String petName) {
          // TODO реализовать
          Client client = null;
          for (int i = 0; i < clients.size(); i++) {
               if (clients.get(i).getPet().equals(petName)) {
                    client = clients.get(i);
               }
          }
          return client;
     }

     /**
      * Ищет клиета по имени питомца.
      *@param id имя клиента.
      */
     public Client findClientsById(final String id) {
          // TODO реализовать
          Client client = null;
          for (int i = 0; i < clients.size(); i++) {
               if (clients.get(i).getId().equals(id)) {
                    client = clients.get(i);
               }
          }
          return client;
     }

     public Client getClientAndPet(int i) {
          return clients.get(i);
     }







     
}    

