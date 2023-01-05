package br.com.nativos.produtivos.usuario.aplication.service;

import br.com.nativos.produtivos.usuario.aplication.api.*;
import br.com.nativos.produtivos.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioAplicationService implements UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Override
    public UsuarioCriadoResponse criaNovoUsuario(UsuarioNovoRequest usuarioNovo) {
        log.info("[inicia] UsuarioAplicationService - criaNovoUsuario");
        Usuario usuario = usuarioRepository.salva(new Usuario(usuarioNovo));
        log.info("[final] UsuarioAplicationService - criaNovoUsuario");
        return UsuarioCriadoResponse.builder()
                .idUsuario(usuario.getIdUsuario())
                .build();
    }

    @Override
    public UsuarioCriadoDetalhado buscaUsuarioPorId(UUID idUsuario) {
        log.info("[inicia] UsuarioAplicationService - buscaUsuarioPorId");
        Usuario usuario = usuarioRepository.buscaUsuarioPorId(idUsuario);
        log.info("[final] UsuarioAplicationService - buscaUsuarioPorId");
        return new UsuarioCriadoDetalhado(usuario);
    }
    @Override
    public List<UsuarioListResponse> buscaTodosUsuarios() {
        log.info("[inicia] UsuarioAplicationService - buscaTodosUsuarios");
        List<Usuario> Usuarios = usuarioRepository.buscaTodosUsuarios();
        log.info("[final] UsuarioAplicationService - buscaTodosUsuarios");
        return UsuarioListResponse.converte(Usuarios);
    }

    @Override
    public void deletaUsuarioUsandoId(UUID idUsuario) {
        log.info("[inicia] UsuarioAplicationService - deletaUsuarioUsandoId");
        usuarioRepository.deleta(idUsuario);
        log.info("[final] UsuarioAplicationService - deletaUsuarioUsandoId");
    }
    @Override
    public void alteraUsuarioPeloId(UUID idUsuario, UsuarioAlteracaoRequest usuarioAlteracaoRequest) {
        log.info("[inicia] UsuarioAplicationService - alteraUsuarioPeloId");
        Usuario usuario = usuarioRepository.buscaUsuarioPorId(idUsuario);
        usuario.alteraUsuarioPeloId(usuarioAlteracaoRequest);
        usuarioRepository.salva(usuario);
        log.info("[final] UsuarioAplicationService - alteraUsuarioPeloId");
    }
}
