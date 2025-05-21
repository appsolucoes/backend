package com.hojeonde.hoje.models;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.NumberFormat;

import java.util.UUID;

@Entity
@Table(name = "organizadores")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Organizador {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @NotBlank
    private UUID idOrganizador;
    @NotBlank
    private String nome;
    @Email(message = "Email inválido")
    private String email;
    @NumberFormat
    private String telefone;

     @OneToOne
    Evento evento;


}
