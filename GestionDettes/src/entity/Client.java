package entity;

public class Client {
     private String nom;
     private String telephone; 
     private String adresse;
     private double montantDu=0;
    //Un client peu avoir plusieurs dettes
     private final int N=10;
     private Dette[] dettes=new Dette[N];
     private int nbreDette=0;
     public Dette[] getDettes() {
        return dettes;
    }
     public int getNbreDette() {
        return nbreDette;
     }
     //add Dette to Client
     public boolean addDette(Dette dette) {
        if (nbreDette<N-1) {
            dettes[nbreDette]=dette; 
            nbreDette++;
            montantDu=montantDu+dette.getMontantDette();
            return true;  
         }
        return false;
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

    public int getN() {
        return N;
    }

    

}
