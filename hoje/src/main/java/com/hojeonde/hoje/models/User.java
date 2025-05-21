package com.hojeonde.hoje.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.NumberFormat;

@Entity
@Table(name = "Users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // Alterei para AUTO ou IDENTITY (para UUID você poderia usar outra estratégia, mas geralmente isso seria com AUTO)
    private UUID idUser;
    @CPF
    private String cpf;

    @NotBlank(message = "O nome é obrigatório")  // Certifique-se de usar a anotação certa
    private String nome;

    @Email(message = "Email inválido")  // Certifique-se de que o e-mail está correto
    @NotBlank(message = "O email é obrigatório")
    private String email;
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private String telefone;

    @OneToMany(mappedBy = "user")  // Relacionamento de um para muitos - Certifique-se de que a classe 'Ingressos' tem o atributo 'user'
    private List<Ingressos> ingressos;  // A lista de ingressos deve ser do tipo List ou Set (por exemplo)
}
