import java.util.Scanner;

import entity.Compte;
import entity.Transaction;
import entity.TypeTransaction;
import services.CompteService;
import views.CompteVue;
import views.TransactionVue;

public class App {
    //Attributs
    
     private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
      
       //Fabrique Dependance
         CompteService compteService=new CompteService();
         CompteVue compteVue=new CompteVue(compteService);
         TransactionVue transactionVue=new TransactionVue();
        int choix;
          do {
             choix= menu();
             switch (choix) {
                case 1:
                  Compte compte=compteVue.saisie(); 
                  compteService.addCompte(compte);
                  Transaction trans=new Transaction(compte.getMontant(),TypeTransaction.Depot);
                  compte.addTransactions(trans);
                    break;
                  case 2:
                    System.out.println("Le nombre de comptes crees est "+Compte.getNbreCompte());
                    compteVue.affiche(compteService.getAllComptes());
                    break;
                case 3:
                 String numero=  compteVue.saisieChaine("Entrer le numero du compte");
                 compte =compteService.searchCompteByNumero(numero);
                 if (compte==null) {
                    System.out.println("Aucun compte ne correspond a ce numero");
                 }else{
                    Transaction transaction=transactionVue.saisie();
                    if(compte.addTransactions(transaction)){
                        System.out.println("Transaction effectuee");
                    }else{
                        System.out.println("Solde insuffisant pour faire la transaction");
                    }
                 }
                break;
                case 4:
                  numero=  compteVue.saisieChaine("Entrer le numero du compte");
                  compte =compteService.searchCompteByNumero(numero);
                  if (compte==null) {
                    System.out.println("Aucun compte ne correspond a ce numero");
                  }else{
                   transactionVue.affiche(compte.getTransactions());
                  }
                break;
                default:
                    break;
             }
          } while (choix!=5);
    }


    public static int menu(){
        System.out.println("1-Ajouter Comptes");
        System.out.println("2-Lister les Comptes");
        System.out.println("3-Ajouter une Transaction à un compte");
        System.out.println("4-Lister les Transactions d' un compte");
        System.out.println("5-Quitter");
       return scanner.nextInt();

    }
}
