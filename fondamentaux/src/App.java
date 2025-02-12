import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Type primitifs
         long nbre1;
         double nbre2 ;//2.5
    
        //Decalration
         Scanner scanner ;
        //Instanciation
        scanner = new Scanner(System.in);
             System.out.println("Entrer un nombre1");
             nbre1 = scanner.nextInt();
              System.out.println("Entrer un nombre2");
              nbre2 = scanner.nextDouble();
              double som=nbre1+nbre2;
             System.out.println("La somme est "+som);
    
        //Appel de methode
        scanner.close();


    }
}
