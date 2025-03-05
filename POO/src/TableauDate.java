import java.util.Scanner;

public class TableauDate {
    /*
     *   Classe nomTab[];
     *   MyDate tabDate[]; //objet de type Tableau MyDate
     *    tabDate=new MyDate[10] //Tableau de 10 objets MyDate
     *    NB:Apres creation du tableau les cellules sont initialises a null(Pas Objet)
     *      tabDate[0] //Objet MyDate se trouvant a la position 0 du tableau
     *      tabDate[0]=new MyDate() 
     *      tabDate[0]. ==>Utiliser les methodes de l'interface de l'objet a la position 0
     *   tabDate[1] //Objet MyDate se trouvant a la position 0 du tableau
     * 
     * 1.Declarer le tableau 
     * 2. Instancier le tableau
     * 3. Instancier les cellules tableau
     */
      static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarer un tableau 10 Date
           MyDate tDate[];
        //Instancier le tableau
        tDate=new MyDate[10];
        //Instancier les cellules tableau
        for (int index = 0; index < 4; index++) {
            tDate[index]=saisieDate();
        }

        for (int index = 0; index < 4; index++) {
              tDate[index].afficheDateEng();
        }
       
       
        MyDate[] tDate1;

        tDate1=new MyDate[10];
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
