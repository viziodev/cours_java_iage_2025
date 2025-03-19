package vue;

import java.util.List;
import java.util.Scanner;

import entity.Paiement;

public class PaiementVue {
         private Scanner scanner=new Scanner(System.in);
    public Paiement scanPayement(){
        Paiement paiement=new Paiement();
        System.out.println("Entrer la Date de la Dette");
        paiement.setDate(scanner.nextLine());
        System.out.println("Entrer le Montant de la Dette");
        paiement.setMontant(scanner.nextDouble());
        return paiement; 
     }

     public void showListPaiement(List<Paiement>paiements){
        for (int index = 0; index < paiements.size(); index++) {
             System.out.println(paiements.get(index).toString());
        }
      }
}
