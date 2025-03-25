package entity;

import java.time.LocalDate;

public class Transaction {
       private int id;
       private LocalDate  date;
       private double montant;
       private TypeTransaction type;
       private static int nbreTransactions=0;
      public Transaction(double montant, TypeTransaction type) {
        nbreTransactions++;
        id=nbreTransactions; 
        this.date = LocalDate.now();
        this.montant = montant;
        this.type = type;
      }

    public Transaction() {
        nbreTransactions++;
        id=nbreTransactions; 
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public static int getNbreTransactions() {
        return nbreTransactions;
    }
    public TypeTransaction getType() {
        return type;
    }
    public void setType(TypeTransaction type) {
        this.type = type;
    }
    public static void setNbreTransactions(int nbreTransactions) {
        Transaction.nbreTransactions = nbreTransactions;
    }
    @Override
    public String toString() {
        return "Transaction [id=" + id + ", date=" + date + ", montant=" + montant + ", type=" + type + "]";
    }
   
}
       

