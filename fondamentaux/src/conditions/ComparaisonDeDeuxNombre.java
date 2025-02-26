package conditions;

import java.util.Scanner;

public class ComparaisonDeDeuxNombre {
    public static void main(String[] args) {
               //Declaration de l'objet sc
               Scanner sc;
                 int nbre1,nbre2;
                 int minNombre,maxNombre;
                 //Instanciation de l'objet sc
               sc = new Scanner(System.in);
                  System.out.println("Entrer un nombre1");
                  nbre1 = sc.nextInt();
                  System.out.println("Entrer un nombre2");
                  nbre2 = sc.nextInt();
                
                  if (nbre1<nbre2) {
                    minNombre=nbre1;
                    maxNombre=nbre2;
                  } else //nbre1>=nbre2 
                  {
                    minNombre=nbre2;
                    maxNombre=nbre1;
                  }
                  System.out.println(minNombre + "<" + maxNombre);

               sc.close();
    }
}
