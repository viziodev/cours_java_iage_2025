import java.util.Scanner;

import entity.Carre;
import entity.Figure;
import services.FigureService;
import views.FigureVue;

public class App {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
     
      
        int choix;
        do {
            System.out.println("1-Ajouter une figure");
            System.out.println("2-Lister Rectangle");
            System.out.println("3-Quitter");
            System.out.println("Veuillez selectionner une figure");
            choix=scanner.nextInt();
            switch (choix) {
                case 1:
                    Figure figure=  FigureVue.saisie();
                    FigureService.add(figure);  
                    break;
                    case 2:
                    FigureVue.affiche(FigureService.getFigures());
                    break;
                default:
                    break;
            }
       } while (choix!=3);
    }
}
