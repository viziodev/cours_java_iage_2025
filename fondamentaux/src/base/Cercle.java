package base;
import java.util.Scanner;

public class Cercle {
   /*
     * Exercice 1 : Saisir le rayon d'un cercle puis determine et affiche
     *           1-Diametre  =rayon*2
     *           2-Circonference ==rayon*2*PI
     *           3-Surface =rayon*rayon*PI
     */ 

     public static void main(String[] args) {
             double rayon,diametre,circonference,surface ;
             //x au carre  Math.pow(x, 2)
              //Declaration de l'objet sc
               Scanner sc;
              //Instanciation de l'objet sc
               sc = new Scanner(System.in);
                System.out.println("Entrer le rayon du cercle");
                rayon = sc.nextDouble();
                diametre=rayon*2;
                circonference=rayon* Math.PI*2;
                surface= Math.pow(rayon, 2)* Math.PI;
                System.out.println("Rayon : " + rayon);
                System.out.println("Diametre : " + diametre);
                System.out.println("Circonference : " + circonference);
                System.out.println("Surface : " + surface);
            
            sc.close();
     }
}
