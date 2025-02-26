package boucles;

import java.util.Scanner;

public class Note {
     public static void main(String[] args) {
        /*
         * Saisir une serie de 10 notes
         * puis de de detreminer le plus grand et le plus petit
         * note [0,20]
         * Cas Valide note>=0 et note<=20 
         * Cas invalide !(note>=0 et note<=20)==>note<0 ou note>20 
         */
          Scanner sc;
          sc = new Scanner(System.in);
          int i;
          double note,noteMax=0,noteMin=0;
          for (i = 1; i <=4; i++) {
            do {
                System.out.println("Entrer une Note");
                note=sc.nextDouble();
                if(note<0 || note>20){
                    System.out.println(note+" saisie est invalide");
                }  
            } while (note<0 || note>20 );
              if (i==1) {
                noteMax=noteMin=note;
              }else{
                if (noteMax<note) {
                    noteMax=note;
                }
                if (noteMin>note) {
                    noteMin=note;
                }
              }

          }
         System.out.println("noteMax: " + noteMax);
         System.out.println("noteMin: " + noteMin);
          sc.close();

     }
}
