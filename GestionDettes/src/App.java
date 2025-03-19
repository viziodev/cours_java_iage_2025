import java.util.Scanner;

import entity.Client;
import entity.Dette;
import entity.Paiement;
import services.ClientService;
import services.DetteService;
import vue.ClientVue;
import vue.DetteVue;
import vue.PaiementVue;

public class App {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ClientVue clientVue = new ClientVue();
        ClientService clientService = new ClientService();
        DetteService detteService = new DetteService();
        DetteVue detteVue = new DetteVue();
        PaiementVue paiementVue = new PaiementVue(); //
        int choix;
        
    do {
         System.out.println("1-Ajouter  un client  dans un Tableau\n" + 
                            "2-Afficher les clients du Tableau\n" + 
                            "3-Ajouter une Dette à un client\n" + 
                            "4-Lister dettes d’un client\n" + 
                            "5-Ajouter un Paiement une Dette\n" + 
                            "6-Lister les Payements d’une Dette d’un client\n" + 
                            "7-Quitter\n" );
          choix=scanner.nextInt();
            switch (choix) {
                case 1:
                   //Saisie du Client
                    Client client=  clientVue.scanClient();
                   //Ajouter le client dans le tableau
                   boolean isCreated= clientService.addClient(client);
                    if (isCreated==true) {
                      System.out.println("Client ajoute dans le tableau");
                    } 
                    break;
                 case 2:
                   clientVue.showTabClient(clientService.getTabClients());
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
                         detteVue.showTabDette(client.getDettes());
                    }
                     break;

                     case 5:
                     scanner.nextLine();
                      System.out.println("Entrer le Telephone");
                      tel=scanner.nextLine();
                      client= clientService.searchClientByTel(tel);
                      if (client==null) {
                           System.out.println("Ce numero ne correspond pas a un client");
                      }else{
                          System.out.println("Entrer le Numero de la Dette");
                          String numero=scanner.nextLine();
                          Dette dette= detteService.searchDetteByNumero(client.getDettes(),numero);
                          if (dette!=null) {
                               Paiement paiement=  paiementVue.scanPayement();
                               dette.addPaiement(paiement);
                          }else{
                            System.out.println("Ce numero ne correspond pas a une Dette");
                          }
                      }
                      break;

                      case 6:
                      scanner.nextLine();
                      System.out.println("Entrer le Telephone");
                      tel=scanner.nextLine();
                      client= clientService.searchClientByTel(tel);
                      if (client==null) {
                           System.out.println("Ce numero ne correspond pas a un client");
                      }else{
                          System.out.println("Entrer le Numero de la Dette");
                          String numero=scanner.nextLine();
                          Dette dette= detteService.searchDetteByNumero(client.getDettes(),numero);
                          if (dette!=null) {
                              paiementVue.showListPaiement(dette.getPaiements());
                          }else{
                            System.out.println("Ce numero ne correspond pas a une Dette");
                          }
                      }
                      break;
                default:
                    
                    break;
            }
     } while (choix!=7);
    }
}
