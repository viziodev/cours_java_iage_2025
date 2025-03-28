package views;

import java.util.List;
import java.util.Scanner;

import entity.Carre;
import entity.Figure;
import entity.FigureName;
import entity.Rectangle;

public class FigureVue {
      private static Scanner scanner=new Scanner(System.in);
     public static Figure saisie(){
        Figure fig;
        int choix;
        do {
             System.out.println("1-Carre");
             System.out.println("2-Rectangle");
             System.out.println("Veuillez selectionner une figure");
             choix=scanner.nextInt();
        } while (choix!=1&&choix!=2);
        FigureName name=choix==1?FigureName.Carre:FigureName.Rectangle;
        if (name==FigureName.Carre) {
             fig=new Carre(); 
             int cote;
             do {
                System.out.println("Entrer le cote du caree");
                cote=scanner.nextInt();
             } while (cote<=0);
             ((Carre)fig).setCote(cote);
           
        }else{
            fig=new Rectangle(); 
            int longueur,largeur;
            do {
               System.out.println("Entrer la longeur du rectangle");
               longueur=scanner.nextInt();
            } while (longueur<=0);
            do {
                System.out.println("Entrer la largeur du rectangle");
                largeur=scanner.nextInt();
             } while (largeur<=0);
            ((Rectangle)fig).setLargeur(largeur);
            ((Rectangle)fig).setLongueur(longueur);
        }
        return fig;
     }

     public static void affiche(List<Figure> figures){
         for (int index = 0; index < figures.size(); index++) {
              System.out.println(figures.get(index));
              System.out.println("Surface "+figures.get(index).surface());
              System.out.println("Perimetre "+figures.get(index).perimetre());
         }
     }

}
