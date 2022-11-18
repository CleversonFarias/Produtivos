package br.com.nativos.produtivos.usuario.aplication.api;

import br.com.nativos.produtivos.usuario.domain.Usuario;
import lombok.Value;

import java.util.UUID;
@Value
public class UsuarioCriadoResponse {
    private final UUID idUsuario;
    private final String nome;
    private final String email;


    public UsuarioCriadoResponse(Usuario usuario) {
        this.idUsuario = usuario.getIdUsuario();
        this.email = usuario.getEmail();
        this.nome = usuario.getNome();
    }
}