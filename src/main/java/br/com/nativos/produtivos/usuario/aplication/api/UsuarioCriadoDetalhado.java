package br.com.nativos.produtivos.usuario.aplication.api;

import br.com.nativos.produtivos.usuario.domain.Usuario;
import lombok.Value;

import java.util.UUID;


@Value
public class UsuarioCriadoDetalhado {
    private UUID idUsuario;
    private String nome;
    public UsuarioCriadoDetalhado(Usuario usuario) {
        this.idUsuario = usuario.getIdUsuario();
        this.nome = usuario.getNome();
    }
}