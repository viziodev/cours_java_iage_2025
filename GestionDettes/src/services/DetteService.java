package services;

import java.util.List;


import entity.Dette;

public class DetteService {

   public Dette searchDetteByNumero(List<Dette> dettes,String numero)
   {
       for (int index = 0; index < dettes.size(); index++) {
          if (dettes.get(index).getNumero().compareTo(numero)==0) {
              return dettes.get(index);
          }
       }
      return null;
   }

    

}
