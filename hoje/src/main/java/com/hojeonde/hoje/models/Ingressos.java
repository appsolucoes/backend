package com.hojeonde.hoje.models;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table (name = "Ingressos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ingressos {
    @Id
  @GeneratedValue(strategy = GenerationType.UUID)
    @NotBlank
    private UUID idIngresso;
    @NotBlank
    private String Tipo;
    @NotBlank
    private String valor;
    @NotBlank
    private String quantidade;
    @NotBlank
    private String lote;



  @ManyToOne
    Evento evento;
    
}
