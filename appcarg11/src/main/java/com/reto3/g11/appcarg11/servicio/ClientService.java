package com.reto3.g11.appcarg11.servicio;

import com.reto3.g11.appcarg11.entidad.Client;
import com.reto3.g11.appcarg11.repositorio.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    public List<Client>getClients(){
        return repository.findAll();
    }

    public Client saveClient(Client client){
        return repository.save(client);
    }

    public Client getClient(long id){
        return repository.findById(id).orElse(null);
    }

    public Client updateClient(Client clientUpd){
        Client clientOld = getClient(clientUpd.getId_client());
        clientOld.setName_client(clientUpd.getName_client());
        clientOld.setEmail(clientUpd.getEmail());
        clientOld.setAge(clientUpd.getAge());
        clientOld.setPassword(clientUpd.getPassword());
        return repository.save(clientOld);
    }

    public void deleteClient(long id){
        repository.deleteById(id);
    }
}
