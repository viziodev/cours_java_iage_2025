package views;

import java.time.LocalDate;
import java.util.ArrayList;

import entity.Transaction;
import entity.TypeTransaction;
//Sous-classe (Classe enfant) → La classe qui hérite de la superclasse et peut ajouter ou modifier des fonctionnalités.
public class TransactionVue  extends Vue{
    public Transaction saisie(){
      Transaction transaction = new Transaction();
        //1-Numero d'un compte est unique
         transaction.setDate(LocalDate.now()); 
         transaction.setMontant(saisieDouble("Entrer le Montant de la Transaction")); 
         transaction.setType(saisieTypeTransaction());
        return transaction;
    }

     public void affiche(ArrayList<Transaction> transactions){
         for (Transaction transaction : transactions) {
            System.out.println(transaction.toString());
         }
    }

   private TypeTransaction saisieTypeTransaction(){
    int type;
    do {
        System.out.println("1-Retrait");
        System.out.println("2-Depot"); 
        type=scanner.nextInt();
    } while (type!=1 && type!=2);
       return type==1?TypeTransaction.Retrait:TypeTransaction.Depot;
    }

}
