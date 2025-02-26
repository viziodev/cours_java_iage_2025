

public class MyDate {
   //Donnees ou les attributs
      private int j,m,a; 
    //Traitement ou methodes
     //Getters 
      public int getJ() { return j; }
      public int getM() { return m; } 
      public int getA() { return a; }

      //Setters
      public void setJ(int jour) {
          //Preserver les regles d'integrite du jour
           if (jour>=1 && jour<=31) {
                j = jour;
           }
        }
      public void setM(int arg) { m = arg;}
      public void setA(int arg) { a = arg;}


     public void afficheDateFr(){
        System.out.println(j+"/ "+m+"/"+a);
     }
    public void afficheDateEng(){
        System.out.println(a+"/"+m+"/"+j);
     }
    public boolean valideDate(){
        return false;
    }
    public MyDate compare(){
        return null;
    }
}
