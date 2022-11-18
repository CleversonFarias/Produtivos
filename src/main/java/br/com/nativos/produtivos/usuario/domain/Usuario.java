package br.com.nativos.produtivos.usuario.domain;

import br.com.nativos.produtivos.usuario.aplication.api.UsuarioNovoRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Document(collection = "Usuario")
public class Usuario {
    @Id
    private UUID idUsuario;
    private String nome;
    @Email
    @Indexed
    private String email;

    public Usuario(UsuarioNovoRequest usuarioNovo) {
        this.email = usuarioNovo.getEmail();
    }
}
           