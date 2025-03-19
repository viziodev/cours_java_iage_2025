package services;
import java.util.ArrayList;
import java.util.List;

import entity.Client;

public class ClientService {

    private List<Client> tabClients=new ArrayList<>() ;
    public List<Client> getTabClients() {
        return tabClients;
    }
    

   public boolean addClient(Client client) {
      tabClients.add(client);
      return true;
    }
   public Client searchClientByTel(String tel)
   {
       for (int index = 0; index < tabClients.size(); index++) {
          if (tabClients.get(index).getTelephone().compareTo(tel)==0) {
              return tabClients.get(index);
          }
       }
      return null;
   }

    

}
