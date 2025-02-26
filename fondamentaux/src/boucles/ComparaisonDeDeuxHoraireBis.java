package boucles;

import java.util.Scanner;

public class ComparaisonDeDeuxHoraireBis {
    public static void main(String[] args) {
        //Horaire ==> Heure:minute:seconde
        //Horaire la plus rescente
           Scanner sc;
          sc = new Scanner(System.in);
                  int h1,mn1,s1;
                  int h2,mn2,s2;
                  int h1s,h2s;
                  sc = new Scanner(System.in);
                  do {
                     System.out.println("Entrer l'Heure de l'horaire 1");
                     h1 = sc.nextInt();
                  } while (h1<0 || h1>24); 
                 do {
                    System.out.println("Entrer les minutes de l'horaire 1");
                    mn1 = sc.nextInt();
                 } while (mn1<0 || mn1>60);
                 do {
                  System.out.println("Entrer les secondes de l'horaire 1");
                  s1 = sc.nextInt();
                 } while (s1<0 || s1>60);
                  h1s=h1*3600+mn1*60+s1;
                  do {
                   System.out.println("Entrer l'Heure de l'horaire 2");
                    h2 = sc.nextInt();
               } while (h2<0 || h2>24);
               do {
                  System.out.println("Entrer les minutes de l'horaire 2");
                  mn2 = sc.nextInt();
               } while (mn2<0 || mn2>60);
               do {
                  System.out.println("Entrer les secondes de l'horaire 2");
                  s2 = sc.nextInt();
               } while (s1<0 || s1>60);
                  h2s=h2*3600+mn2*60+s2;
                  if (h1s<h2s) {
                     System.out.println(h2+":"+mn2+":"+s2);
                  }else{
                     if (h1s>h2s) {
                        System.out.println(h1+":"+mn1+":"+s1);
                     } else {
                        System.out.println("Horaires sont egaux");
                     }
                  }

                  
             sc.close();      
                  
    }
}
