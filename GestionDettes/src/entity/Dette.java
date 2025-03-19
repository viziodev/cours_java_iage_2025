package entity;

import java.util.ArrayList;
import java.util.List;

public class Dette {
    private String numero;
    private String date;
    private double montantDette,montantPaye,montantRestant;
    private List<Paiement> paiements=new ArrayList<>();

    public List<Paiement> getPaiements() {
        return paiements;
    }
   public void addPaiement(Paiement paiement){
         paiements.add(paiement);
         montantPaye+=paiement.getMontant();
         montantRestant-=paiement.getMontant();
   }
   
    public Dette() {
   }

   
public String getDate() {
    return date;
}
public void setDate(String date) {
    this.date = date;
}
public double getMontantDette() {
    return montantDette;
}
public void setMontantDette(double montantDette) {
    this.montantDette = montantDette;
}
public double getMontantPaye() {
    return montantPaye;
}
public void setMontantPaye(double montantPaye) {
    this.montantPaye = montantPaye;
}
public double getMontantRestant() {
    return montantRestant;
}
public void setMontantRestant(double montantRestant) {
    this.montantRestant = montantRestant;
}
@Override
public String toString() {
    return "Dette [date=" + date + ", montantDette=" + montantDette + ", montantPaye=" + montantPaye
            + ", montantRestant=" + montantRestant + "]";
}
public String getNumero() {
    return numero;
}
public void setNumero(String numero) {
    this.numero = numero;
}



   
}
