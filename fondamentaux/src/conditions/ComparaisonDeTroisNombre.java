package conditions;

import java.util.Scanner;

public class ComparaisonDeTroisNombre {
    public static void main(String[] args) {
       //Declaration de l'objet sc
               Scanner sc;
                 double nbre1,nbre2,nbre3;
                 double minNombre,maxNombre;
                 //Instanciation de l'objet sc
                   sc = new Scanner(System.in);
                  System.out.println("Entrer un nombre1");
                  nbre1 = sc.nextDouble();
                  System.out.println("Entrer un nombre2");
                  nbre2 = sc.nextDouble();
                  System.out.println("Entrer un nombre3");
                  nbre3 = sc.nextDouble();
                 
                  if (nbre1<nbre2) {
                    minNombre=nbre1;
                    maxNombre=nbre2;
                  } else //nbre1>=nbre2 
                  {
                    minNombre=nbre2;
                    maxNombre=nbre1;
                  }
                 // Cas 1: ---nbre3---- minNombre--------------maxNombre-----
                 // Cas 2: ------- minNombre-----nbre3---------maxNombre-----
                 // Cas 3: ------- minNombre--------------maxNombre-- nbre3---
                 if (nbre3<minNombre) {
                    System.out.println(nbre3 + "<"+minNombre + "<" + maxNombre);
                 }
                 if (nbre3>=minNombre && nbre3<=maxNombre) {
                      System.out.println(minNombre + "<"+ nbre3 + "<" + maxNombre);
                 }
                 if (nbre3>maxNombre) {
                    System.out.println(minNombre + "<" + maxNombre+ "<"+nbre3 );
                 }
            

               sc.close(); 
    }
}
