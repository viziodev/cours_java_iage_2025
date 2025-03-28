package views;

import java.time.LocalDate;
import java.util.ArrayList;

import entity.Cheque;
import entity.Compte;
import entity.Epargne;
import services.CompteService;
//Sous-classe (Classe enfant) → La classe qui hérite de la superclasse et peut ajouter ou modifier des fonctionnalités.
public class CompteVue extends Vue {
  //Membres Partages
  
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

    
    public Compte saisie(){
        Compte compte ;
        //1-Numero d'un compte est unique
        String numero;
        double montant;
        int typeCompte;
        int dureeBlocage;
       do {
         numero=saisieChaine("Entrer le numero du compte");
       } while (compteService.searchCompteByNumero(numero)!=null);
        montant=saisieDouble("Entrer le solde");
         do {
            System.out.println("1-Compte Epargne"); 
            System.out.println("2-Compte Cheque"); 
            System.out.println("Veuillez choisir un type de compte");
            typeCompte=scanner.nextInt();
         } while (typeCompte!=1 && typeCompte!=2);
         if (typeCompte==1) {
             compte=new Epargne(); //Epargne vers Compte
             dureeBlocage= saisieEntier("Entrer la duree de blocage du compte");
             //((Epargne)compte)  ==> Compte  vers Epargne
            ((Epargne)compte).setDureeBlocage(dureeBlocage);
             
         }else{
             compte=new Cheque();
         }
        compte.setDateCreation(LocalDate.now()); 
        compte.setNumero(numero);
     
        compte.setMontant(montant);
        return compte;
    }

    public void affiche(ArrayList<Compte> comptes){
        for (Compte compte : comptes) {
            System.out.println(compte.toString());
        }
    }
}
