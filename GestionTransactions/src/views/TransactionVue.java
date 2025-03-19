package views;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Transaction;
import entity.TypeTransaction;

public class TransactionVue {
      private Scanner scanner=new Scanner(System.in);
    private double saisieDouble(String message){
        double nbre;
        do {
            System.out.println(message);
            nbre=scanner.nextDouble(); 
        } while (nbre<=0);

          return nbre;
     }
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
