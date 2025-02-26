package fonctions;

public class Fonction {
/*
 * Traitement elementaire
 *      Fonction avec type retour 
 *      public type nomFonction(type arg1, type arg2){
 *              return resultat       
 *      }
 *     
 *      Fonction void
 *        public void nomFonction(type arg1, type arg2){
 *                     
 *        }
 * 
 */
    public static void main(String[] args) {
         //Fonctions avec type de retour 
           int s=somme(1,3);
        //Fonctions sans type de retour 
           somme1(1,4);
    }
    //Fonctions
    public static int somme(int a, int b){
        return a+b;
    }
    //Procedures
    public static void somme1(int a, int b){
         int s=a+b;
        System.out.println("La somme est "+s);
    }



    
}
