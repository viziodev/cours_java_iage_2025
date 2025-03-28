package entity;

import java.time.LocalDate;

import services.FormatDateService;

public class Epargne extends Compte {
    //12/03/2023 + 2 ==>  12/03/2025
     //Date du Jour ==>12/03/2024  ==> Bloquer 
     //Date du Jour ==>13/03/2025  ==> DeBloquer 
    private int dureeBlocage;  //la duree est en annee
    private LocalDate dateDeblocage;  //dateDuJour +dureeBlocage 
    public Epargne() {
        type=TypeCompte.Epargne;
    }
    public int getDureeBlocage() {
        return dureeBlocage;
    }
    public void setDureeBlocage(int dureeBlocage) {
        this.dureeBlocage = dureeBlocage;
        dateDeblocage=LocalDate.now().minusYears(2).plusYears(dureeBlocage);
    }
    public LocalDate getDateDeblocage() {
        return dateDeblocage;
    }

    public boolean  isBloqued(){
        return LocalDate.now().isBefore(dateDeblocage);
    }

    @Override
    public String toString() {
      return "Compte Epargne [id=" + id + ", numero=" + numero
            + ", dateCreation=" + FormatDateService.toFr(dateCreation) 
            + ", montant=" + montant + ", Type=" + type 
            + ", Duree Blocage= " +  dureeBlocage + ", Date Fin Blocage=" 
            + FormatDateService.toFr(dateDeblocage) + "]";
      }
    @Override
    public boolean retrait(Transaction transaction) {
        //super represente le parent ie un objet de type compte
        if (isBloqued()) {
            return false;
        }
          return super.retrait(transaction);
    }

    
}
