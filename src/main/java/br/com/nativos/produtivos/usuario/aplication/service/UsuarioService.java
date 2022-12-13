package br.com.nativos.produtivos.usuario.aplication.service;

import br.com.nativos.produtivos.usuario.aplication.api.UsuarioCriadoResponse;
import br.com.nativos.produtivos.usuario.aplication.api.UsuarioNovoRequest;

import java.util.UUID;

public interface UsuarioService {
    UsuarioCriadoResponse criaNovoUsuario(UsuarioNovoRequest usuarioNovo);
    void deletaUsuarioUsandoId(UUID idUsuario);
}
