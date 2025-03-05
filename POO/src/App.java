import java.util.Scanner;

public class App {
     static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        MyDate date1=saisieDate();
        date1.afficheDateFr();
        date1.afficheDateEng();
   
        MyDate date2Date = new MyDate();
    }
    static  MyDate  saisieDate(){
        MyDate date1;
        date1 = new MyDate();
            System.out.println("Entrer le jour");
            date1.setJ(scanner.nextInt());//Violer l'integrite du jour
            System.out.println("Entrer le mois");
             date1.setM(scanner.nextInt());
             System.out.println("Entrer l'annee");
              date1.setA(scanner.nextInt());

        return date1;
     }
}
