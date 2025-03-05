package vue;

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

     public void showTabClient(Client[] clients,int nbreClient){
       for (int index = 0; index < nbreClient; index++) {
            System.out.println(clients[index].toString());
       }
     }
}
