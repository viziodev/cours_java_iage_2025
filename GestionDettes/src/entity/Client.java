package entity;

import java.util.ArrayList;
import java.util.List;

public class Client {
     private String nom;
     private String telephone; 
     private String adresse;
     private double montantDu=0;
    //Un client peu avoir plusieurs dettes

     private List<Dette> dettes=new ArrayList<>();
   
     public List<Dette> getDettes() {
        return dettes;
    }
     
     //add Dette to Client
     public boolean addDette(Dette dette) {
            dettes.add(dette);
            montantDu=montantDu+dette.getMontantDette();
            return true;  
       
    }



    //Constructeur
    public Client() {
    }

     //Getters and Setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    //Methodes Metier
    //Transformer un objet client en une chaine ==>Serialization  
    @Override
    public String toString() {
        return   "Nom et Prenom: " + nom 
                + "\nTelephone: " + telephone 
                + "\nAdresse: " + adresse 
                + "\nMontant Du: " + montantDu ;
    }

   
    

}
