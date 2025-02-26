package fonctions;

import java.util.Scanner;

public class MinMax {
       static Scanner sc= new Scanner(System.in);
       static double notes[]=new double[4];
     public static void main(String[] args) {
          
          //Traitements de Saisie de  4 Notes
            saisieTableauNote(4);
          //Afficher le tableau de notes
            afficheTableauNote(4);
         //Determiner la note min et max
            minMaxTableauNote(4);
           sc.close();
     }

     //Saisie + controle d'une note
     public static double saisieNote(){
        double note;
        do {
            System.out.println("Entrer une Note");
            note=sc.nextDouble();
            if(note<0 || note>20){
                System.out.println(note+" saisie est invalide");
            }  
        } while (note<0 || note>20 );
        return note;
     }
      //Traitements de Saisie de  4 Notes
      public static void saisieTableauNote(int N){
        for (int index = 0; index < N; index++) {
            //Saisie + controle d'une note
            notes[index] = saisieNote();
        }
      } 

      public static void afficheTableauNote(int N){
        for (int index = 0; index < N; index++) {
            System.out.print(notes[index]+"|");
        }
      }

      public static void minMaxTableauNote(int N){
        double noteMax=notes[0],noteMin=notes[0];
        for (int index = 1; index < N; index++) {
            if (noteMax<notes[index]) {
                noteMax=notes[index];
            }
            if (noteMin>notes[index]) {
                noteMin=notes[index];
            }
        }
          System.out.println("noteMax: " + noteMax);
         System.out.println("noteMin: " + noteMin);
      }


     
}
