package br.com.nativos.produtivos.usuario.aplication.service;

import br.com.nativos.produtivos.usuario.domain.Usuario;

import java.util.List;
import java.util.UUID;

public interface UsuarioRepository {
    Usuario salva(Usuario usuario);
    void deleta(UUID idUsuario);
    Usuario buscaUsuarioPorId(UUID idUsuario);
    List<Usuario> buscaTodosUsuarios();
}
