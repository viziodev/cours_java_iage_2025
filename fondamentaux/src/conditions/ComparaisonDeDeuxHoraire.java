package conditions;

import java.util.Scanner;

public class ComparaisonDeDeuxHoraire {
    public static void main(String[] args) {
        //Horaire ==> Heure:minute:seconde
        //Horaire la plus rescente
           Scanner sc;
          sc = new Scanner(System.in);
                  int h1,mn1,s1;
                  int h2,mn2,s2;
                  int h3=0,mn3=0,s3=0;
                  sc = new Scanner(System.in);
                  System.out.println("Entrer l'Heure de l'horaire 1");
                  h1 = sc.nextInt();
                  System.out.println("Entrer les minutes de l'horaire 1");
                  mn1 = sc.nextInt();
                  System.out.println("Entrer les secondes de l'horaire 1");
                  s1 = sc.nextInt();

                  System.out.println("Entrer l'Heure de l'horaire 2");
                  h2 = sc.nextInt();
                  System.out.println("Entrer les minutes de l'horaire 2");
                  mn2 = sc.nextInt();
                  System.out.println("Entrer les secondes de l'horaire 2");
                  s2 = sc.nextInt();

                  //12:20:50 14:01:15
                  if (h1<h2) {
                     h3=h2;
                     mn3=mn2;
                     s3=s2; 
                  }else //h1>=h2
                  {
                    if (h1>h2) {
                        h3=h1;
                        mn3=mn1;
                        s3=s1; 
                    } else//h1=h2
                     {
                        if (mn1<mn2) {
                            h3=h2;
                            mn3=mn2;
                            s3=s2; 
                         } else //mn1>=mn2
                         {
                           if (mn1>mn2) {
                                h3=h1;
                                mn3=mn1;
                               s3=s1;
                           }else{
                              if(s1<s2) {
                                h3=h2;
                                mn3=mn2;
                                s3=s2;
                              }else{
                                 if (s1>s2) {
                                    h3=h1;
                                     mn3=mn1;
                                    s3=s1;
                                 }else{
                                      System.out.println("Horaires sont egaux");
                                 }
                              }
                          } 
                          
                     }
                  }
                 
                    
                }
                System.out.println(h3+":"+mn3+":"+s3);
               
                  
    }
}
