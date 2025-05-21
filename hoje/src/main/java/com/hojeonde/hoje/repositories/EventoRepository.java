package com.hojeonde.hoje.repositories;

import com.hojeonde.hoje.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface EventoRepository extends JpaRepository<Evento, String> {
    boolean existsByNomeAndDataInicio(String nome, LocalDate dataInicio);

}
