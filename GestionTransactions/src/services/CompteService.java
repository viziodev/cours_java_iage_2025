package services;

import java.util.ArrayList;

import entity.Compte;

public class CompteService {
    private ArrayList<Compte> comptes = new ArrayList<>();
    public  ArrayList<Compte> getAllComptes(){
        return comptes;
    }

    public void addCompte(Compte compte){
        comptes.add(compte);
    }

    public Compte searchCompteByNumero(String numero){
        for (Compte compte : comptes) {
            if(compte.getNumero().compareTo(numero)==0){
                 return compte; 
            }
        }
        return null;
    }
}
