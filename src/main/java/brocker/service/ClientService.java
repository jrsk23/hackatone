package brocker.service;

import brocker.model.Client;
import brocker.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;


    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public Client getClientById (Long id) {
        return clientRepository.getOne(id);
    }

    public Client save(Client client){
        return clientRepository.save(client);
    }
}
