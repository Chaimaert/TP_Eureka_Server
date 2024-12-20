package com.client.Eureka_Client.controllers;

import com.client.Eureka_Client.entities.Client;
import com.client.Eureka_Client.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    // Retrieve all clients
    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    // Retrieve a client by ID
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    // Add a new client
    @PostMapping
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }
}
