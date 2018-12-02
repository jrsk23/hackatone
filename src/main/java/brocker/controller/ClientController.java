package brocker.controller;

import brocker.model.Client;
import brocker.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
//@RequestMapping("/api")
public class ClientController {

    @Autowired
    ClientService clientService;



    @GetMapping("/clients")
    @ResponseBody
    public List<Client> findAll(){
        List<Client> clients = clientService.findAll();
        return clients;
    }

    @GetMapping("/clients/{id}")
    public Client getOne(@PathVariable(value = "id") Long id){
        return clientService.getClientById(id);
    }

    @PostMapping("/client")
    public Client save(@Valid @RequestBody Client client){
        return clientService.save(client);
    }


}
