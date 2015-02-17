/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Components;

import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 * @author Rafal
 */
@ManagedBean
public class ClientView {
    public final static List<Client> clients = new LinkedList<Client>();
    private List<Client> filteredClients = clients;
    public ClientView(){
        System.out.println("Create ClientView");
        System.out.println("dodanie do gita");
    }
    public void addClient(Client client){
        client.idIncrement();
        client.setDate();
        clients.add(client);
        
    }
    public List<Client> getFilteredClients(){
        return filteredClients; 
    }   
    public void setFilteredClients(List<Client> filteredClients) {
        this.filteredClients = filteredClients;
    } 
    public List<Client> getClients(){
   
        return clients;
    }
    public void removeClient(Client client){    
        clients.remove(client);
    }  
}  
