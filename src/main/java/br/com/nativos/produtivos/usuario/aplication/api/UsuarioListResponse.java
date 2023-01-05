package br.com.nativos.produtivos.usuario.aplication.api;

import br.com.nativos.produtivos.usuario.domain.Usuario;
import lombok.Value;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class UsuarioListResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",updatable = false, unique = true, nullable = false)
    @Type(type= "uuid-char")
    private UUID idUsuario;
    private String nome;

    public static List<UsuarioListResponse> converte(List<Usuario> clientes) {
        return clientes.stream()
                .map(UsuarioListResponse::new)
                .collect(Collectors.toList());
    }
    public UsuarioListResponse(Usuario usuario) {
        this.idUsuario = usuario.getIdUsuario();
        this.nome = usuario.getNome();
    }
}