package br.com.nativos.produtivos.usuario.aplication.service;

import br.com.nativos.produtivos.usuario.aplication.api.UsuarioCriadoResponse;
import br.com.nativos.produtivos.usuario.domain.Usuario;

import java.util.UUID;

public interface UsuarioRepository {
    Usuario salva(Usuario usuario);
    void deleta(UUID idUsuario);
    UsuarioCriadoResponse buscaUsuarioPorId(UUID idUsuario);
}
