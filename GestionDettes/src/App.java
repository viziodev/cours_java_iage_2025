import java.util.Scanner;

import entity.Client;
import entity.Dette;
import services.ClientService;
import vue.ClientVue;
import vue.DetteVue;

public class App {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ClientVue clientVue = new ClientVue();
        ClientService clientService = new ClientService();
        DetteVue detteVue = new DetteVue();
        int choix;
    do {
         System.out.println("1-Ajouter  un client  dans un Tableau\n" + 
                            "2-Afficher les clients du Tableau\n" + 
                            "3-Ajouter une Dette à un client\n" + 
                            "4-Lister dettes d’un client\n" + 
                            "6-Quitter\n" );
          choix=scanner.nextInt();
            switch (choix) {
                case 1:
                   //Saisie du Client
                    Client client=  clientVue.scanClient();
                   //Ajouter le client dans le tableau
                   boolean isCreated= clientService.addClient(client);
                    if (isCreated==true) {
                      System.out.println("Client ajoute dans le tableau");
                    } else {
                        System.out.println("Tableau est plein");
                    }
                    break;
                 case 2:
                   clientVue.showTabClient(clientService.getTabClients(),clientService.getNbreClient());
                   break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Entrer le Telephone a qui on veut ajouter une dette");
                    String tel=scanner.nextLine();
                    client= clientService.searchClientByTel(tel);
                    if (client==null) {
                          System.out.println("Ce numero ne correspond pas a un client");
                    }else{
                      Dette dette=  detteVue.scanDette();
                      client.addDette(dette); 
                    }
                    break;
                    case 4:
                    scanner.nextLine();
                    System.out.println("Entrer le Telephone a qui on veut ajouter une dette");
                     tel=scanner.nextLine();
                    client= clientService.searchClientByTel(tel);
                    if (client==null) {
                          System.out.println("Ce numero ne correspond pas a un client");
                    }else{
                         detteVue.showTabDette(client.getDettes(),client.getNbreDette());
                    }
                     break;
                default:
                    
                    break;
            }
     } while (choix!=6);
    }
}
