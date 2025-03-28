package views;

import java.util.Scanner;

//Superclasse (Classe parent|Classe de Base) → La classe dont on hérite.
public class Vue {
       protected Scanner scanner=new Scanner(System.in);
       protected double saisieDouble(String message){
      double nbre;
      do {
          System.out.println(message);
          nbre=scanner.nextDouble(); 
      } while (nbre<=0);

        return nbre;
    }

}
