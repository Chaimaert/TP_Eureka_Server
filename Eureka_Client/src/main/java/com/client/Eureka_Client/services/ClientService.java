package com.client.Eureka_Client.services;

import com.client.Eureka_Client.entities.Client;
import com.client.Eureka_Client.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    // Retrieve all clients
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    // Retrieve a client by ID
    public Client getClientById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client with ID " + id + " not found"));
    }

    // Add a new client
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }
}
