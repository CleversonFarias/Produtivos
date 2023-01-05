package br.com.nativos.produtivos.usuario.domain;

import br.com.nativos.produtivos.usuario.aplication.api.UsuarioAlteracaoRequest;
import br.com.nativos.produtivos.usuario.aplication.api.UsuarioNovoRequest;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",updatable = false, unique = true, nullable = false)
    @Type(type= "uuid-char")
    private UUID idUsuario;
    @NotBlank
    private String nome;
    @NotBlank
    @Email
    private String email;

    public Usuario(@Valid UsuarioNovoRequest usuarioNovo) {
        this.nome = usuarioNovo.getNome();
        this.email = usuarioNovo.getEmail();
    }

    public void alteraUsuarioPeloId(UsuarioAlteracaoRequest usuarioAlteracaoRequest) {
        this.nome = usuarioAlteracaoRequest.getNome();
    }
}
           