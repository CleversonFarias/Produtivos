package br.com.nativos.produtivos.usuario.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Usuario")
public class Usuario {
    @Id
    private UUID idUsuario;
    private String nome;
    @Email
    @Indexed
    private String email;
}
           