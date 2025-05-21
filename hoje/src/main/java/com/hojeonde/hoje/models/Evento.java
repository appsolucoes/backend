package com.hojeonde.hoje.models;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity
@Table (name = "eventos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @NotBlank
    private UUID idEvento;
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    @NotBlank
    private LocalDate dataInicio;
    @NotBlank
    private LocalDate dataFim;
    @NotBlank
    private String idLocal;
    @NotBlank
    private String idOrganizador;

     @ManyToOne
    Local local;
}
