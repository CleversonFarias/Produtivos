package br.com.nativos.produtivos.usuario.aplication.service;

import br.com.nativos.produtivos.usuario.aplication.api.*;

import java.util.List;
import java.util.UUID;

public interface UsuarioService {
    UsuarioCriadoResponse criaNovoUsuario(UsuarioNovoRequest usuarioNovo);
    void deletaUsuarioUsandoId(UUID idUsuario);
    UsuarioCriadoDetalhado buscaUsuarioPorId(UUID idUsuario);
    List<UsuarioListResponse> buscaTodosUsuarios();
    void alteraUsuarioPeloId(UUID idUsuario, UsuarioAlteracaoRequest usuarioAlteracaoRequest);

}
