package views;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Compte;
import services.CompteService;

public class CompteVue {
    private Scanner scanner=new Scanner(System.in);
    //Injection de Dependance
     private CompteService compteService;
     public CompteVue(CompteService compteService) {
        this.compteService = compteService;
     }

    public String saisieChaine(String message){
        String chaine;
        do {
            System.out.println(message);
            chaine=scanner.next(); 
        } while (chaine.compareTo("")==0);
          return chaine;
     }

     private int saisieEntier(String message){
        int nbre;
        do {
            System.out.println(message);
            nbre=scanner.nextInt(); 
        } while (nbre<=0);

          return nbre;
     }

     private double saisieDouble(String message){
        double nbre;
        do {
            System.out.println(message);
            nbre=scanner.nextDouble(); 
        } while (nbre<=0);

          return nbre;
     }
    public Compte saisie(){
      Compte compte = new Compte();
        //1-Numero d'un compte est unique
        String numero;
       do {
         numero=saisieChaine("Entrer le numero du compte");
       } while (compteService.searchCompteByNumero(numero)!=null);
        compte.setNumero(numero);
        compte.setDateCreation(LocalDate.now()); 
        compte.setMontant(saisieDouble("Entrer le solde")); 
        return compte;
    }

    public void affiche(ArrayList<Compte> comptes){
        for (Compte compte : comptes) {
            System.out.println(compte.toString());
        }
    }
}
