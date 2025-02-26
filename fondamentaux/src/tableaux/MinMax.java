package tableaux;

import java.util.Scanner;

public class MinMax {
    /*
     *   type nomTableau[];
     *   nomTableau=new type[Taille]
     *    Creation ==>Taille =Nbre de cellules
     *    Manipulation==>Nbre de Valeurs 
     */

       public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int i;
       
         double notes[];
        notes=new double[4];
        for (int index = 0; index < 4; index++) {
            do {
                System.out.println("Entrer une Note");
                notes[index]=sc.nextDouble();
                if(notes[index]<0 || notes[index]>20){
                    System.out.println(notes[index]+" saisie est invalide");
                }  
            } while (notes[index]<0 || notes[index]>20 );
        }
        for (int index = 0; index < 4; index++) {
            System.out.print(notes[index]+"|");
        }
        double noteMax=notes[0],noteMin=notes[0];
        for (int index = 1; index < 4; index++) {
            if (noteMax<notes[index]) {
                noteMax=notes[index];
            }
            if (noteMin>notes[index]) {
                noteMin=notes[index];
            }
        }
          System.out.println("noteMax: " + noteMax);
         System.out.println("noteMin: " + noteMin);
        sc.close();
       }

    
}
