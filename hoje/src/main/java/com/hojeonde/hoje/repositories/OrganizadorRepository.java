package com.hojeonde.hoje.repositories;

import com.hojeonde.hoje.models.Organizador;
import com.hojeonde.hoje.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface OrganizadorRepository extends JpaRepository<Organizador, String>
{
    Optional<Organizador> findBy(UUID Organizador);

    Optional<Organizador> findById(UUID id);
}
