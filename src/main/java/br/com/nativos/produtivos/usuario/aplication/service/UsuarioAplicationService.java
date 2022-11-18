package br.com.nativos.produtivos.usuario.aplication.service;

import br.com.nativos.produtivos.usuario.aplication.api.UsuarioCriadoResponse;
import br.com.nativos.produtivos.usuario.aplication.api.UsuarioNovoRequest;

public interface UsuarioAplicationService {
    UsuarioCriadoResponse criaNovoUsuario(UsuarioNovoRequest usuarioNovo);
}
