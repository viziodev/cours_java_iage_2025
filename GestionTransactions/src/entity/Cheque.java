package entity;

import services.FormatDateService;

public class Cheque extends Compte {
     private static double frais=0.2;
     public Cheque(){
      type =TypeCompte.Cheque;
     }
     public static double getFrais() {
      return frais;
     }
     public static void setFrais(double frais) {
        Cheque.frais = frais;
     }

   @Override
    public String toString() {
      return "Compte Cheque [id=" + id + ", numero=" + numero
            + ", dateCreation=" + FormatDateService.toFr(dateCreation) 
            + ", montant=" + montant + ", Type=" + type 
            + ", Frais= " +  frais 
            + "]";
      }
   @Override
   public boolean depot(Transaction transaction) {
 
       double fraisTransaction =  transaction.getMontant()*frais;
       double montantDepot=transaction.getMontant()-fraisTransaction;
       transaction.setMontant(montantDepot);
      
      return super.depot(transaction);
   }
   @Override
   public boolean retrait(Transaction transaction) {
      double fraisTransaction =  transaction.getMontant()*frais;
       
      double montantRetrait=transaction.getMontant()+fraisTransaction;
      transaction.setMontant(montantRetrait);
      return super.retrait(transaction);
   }

      
   
}
