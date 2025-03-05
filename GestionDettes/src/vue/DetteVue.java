package vue;

import java.util.Scanner;
import entity.Dette;

public class DetteVue {
     private Scanner scanner=new Scanner(System.in);
     public Dette scanDette(){
        Dette dette=new Dette();
        System.out.println("Entrer la Date de la Dette");
        dette.setDate(scanner.nextLine());
        System.out.println("Entrer le Montant de la Dette");
        dette.setMontantDette(scanner.nextDouble());
        dette.setMontantPaye(0);
        dette.setMontantRestant(dette.getMontantDette());
        return dette;
     }

     public void showTabDette(Dette[] dettes,int nbreDette){
        for (int index = 0; index < nbreDette; index++) {
             System.out.println(dettes[index].toString());
        }
      }
}
