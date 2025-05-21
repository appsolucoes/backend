package com.hojeonde.hoje.models;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table (name = "Locais")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Local {
    @Id
 @GeneratedValue(strategy = GenerationType.UUID)
    @NotBlank
    private UUID idLocal;
    @NotBlank
    private String nome;
    @NotBlank
    private String endereco;
    @NotBlank
    private String capacidade;

     @OneToMany
    Evento evento;
}
