package br.com.nativos.produtivos.usuario.aplication.service;

import br.com.nativos.produtivos.usuario.domain.Usuario;

public interface UsuarioRepository {
    Usuario salva(Usuario usuario);
}
