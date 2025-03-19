package vue;

import java.util.List;
import java.util.Scanner;

import entity.Client;

public class ClientVue {
     private Scanner scanner=new Scanner(System.in);
     public Client scanClient(){
        Client client=new Client();
        System.out.println("Entrer le Nom et Prenom");
        client.setNom(scanner.nextLine());
        System.out.println("Entrer le Telephone");
        client.setTelephone(scanner.nextLine());
        System.out.println("Entrer l'adresse ");
        client.setAdresse(scanner.nextLine());
        return client;
     }

     public void showTabClient(List<Client> clients){
       for (int index = 0; index < clients.size(); index++) {
            System.out.println(clients.get(index).toString());
       }
     }
}
