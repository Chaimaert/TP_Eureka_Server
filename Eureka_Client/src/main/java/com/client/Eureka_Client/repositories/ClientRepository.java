package com.client.Eureka_Client.repositories;

import com.client.Eureka_Client.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
