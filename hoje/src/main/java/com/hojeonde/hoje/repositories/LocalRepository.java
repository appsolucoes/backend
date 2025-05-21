package com.hojeonde.hoje.repositories;

import com.hojeonde.hoje.models.Local;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface LocalRepository extends JpaRepository<Local,String> {
    Optional<Local> findById(UUID id);
    Optional<Local>findByNome(String nome);

}
