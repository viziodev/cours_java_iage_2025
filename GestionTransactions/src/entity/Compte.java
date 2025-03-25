package entity;

import java.time.LocalDate;
import java.util.ArrayList;

import services.FormatDateService;

public class Compte {
    //Attributs Instances
       private int id;
       private String numero;
       private LocalDate  dateCreation;
       private double montant;
       private ArrayList<Transaction> transactions=new ArrayList<>();
       protected TypeCompte type;

       

      public TypeCompte getType() {
        return type;
      }

    public void setType(TypeCompte type) {
        this.type = type;
    }
    //Attributs Static 
       private static int nbreCompte=0;


    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    /* public boolean addTransactions(Transaction transaction) {
         if (transaction.getType()==TypeTransaction.Retrait) {
            if (montant>=transaction.getMontant()) {
                 transactions.add(transaction);
                 montant=montant-transaction.getMontant();
                return true;
            }
            return false;
         } 
         //Depot
         transactions.add(transaction);
         montant=montant+transaction.getMontant();
         return true;
     }
 */

 public boolean depot(Transaction transaction) {
    transactions.add(transaction);
    montant=montant+transaction.getMontant();
    return true;
  }

  public boolean retrait(Transaction transaction) {
        if (montant>=transaction.getMontant()) {
             transactions.add(transaction);
             montant=montant-transaction.getMontant();
            return true;
        }
        return false;
  }



     public static int getNbreCompte() {
        return nbreCompte;
      }
     //Creer un Objet ou Instancier un Objet ==>Methode Instance
      public Compte() {
         nbreCompte++;
         id=nbreCompte;
      }
public int getId() {
   
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getNumero() {
    return numero;
}
public void setNumero(String numero) {
    this.numero = numero;
}

public double getMontant() {
    return montant;
}
public void setMontant(double montant) {
    this.montant = montant;
}
@Override
public String toString() {
    return "Compte [id=" + id + ", numero=" + numero + ", dateCreation=" + FormatDateService.toFr(dateCreation) + ", montant=" + montant + "]";
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Compte other = (Compte) obj;
    if (id != other.id)
        return false;
    return true;
}
public LocalDate getDateCreation() {
    return dateCreation;
}
public void setDateCreation(LocalDate dateCreation) {
    this.dateCreation = dateCreation;
}

   
  
}
