package vue;

import java.util.List;
import java.util.Scanner;
import entity.Dette;

public class DetteVue {
     private Scanner scanner=new Scanner(System.in);
     public Dette scanDette(){
        Dette dette=new Dette();
        System.out.println("Entrer le numero  de la Dette");
        dette.setNumero(scanner.nextLine());
        System.out.println("Entrer la Date de la Dette");
        dette.setDate(scanner.nextLine());
        System.out.println("Entrer le Montant de la Dette");
        dette.setMontantDette(scanner.nextDouble());
        dette.setMontantPaye(0);
        dette.setMontantRestant(dette.getMontantDette());
        return dette;
     }

     public void showTabDette(List<Dette>dettes){
        for (int index = 0; index < dettes.size(); index++) {
             System.out.println(dettes.get(index).toString());
        }
      }
}
