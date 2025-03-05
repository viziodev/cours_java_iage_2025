package services;
import entity.Client;

public class ClientService {
    private final int N=10;
    private Client[] tabClients=new Client[N];
    private int nbreClient=0;

    public Client[] getTabClients() {
        return tabClients;
    }
    public int getNbreClient() {
        return nbreClient;
    }

   public boolean addClient(Client client) {
        if (nbreClient<N-1) {
            tabClients[nbreClient]=client; 
            nbreClient++; 
            return true;  
         }
        return false;
    }
   public Client searchClientByTel(String tel)
   {
       for (int index = 0; index < nbreClient; index++) {
          if (tabClients[index].getTelephone().compareTo(tel)==0) {
              return tabClients[index];
          }
       }
      return null;
   }

    

}
