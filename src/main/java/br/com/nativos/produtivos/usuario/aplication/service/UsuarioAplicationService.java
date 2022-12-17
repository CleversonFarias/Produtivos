package br.com.nativos.produtivos.usuario.aplication.service;

import br.com.nativos.produtivos.usuario.aplication.api.UsuarioCriadoResponse;
import br.com.nativos.produtivos.usuario.aplication.api.UsuarioNovoRequest;
import br.com.nativos.produtivos.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioAplicationService implements UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Override
    public UsuarioCriadoResponse criaNovoUsuario(UsuarioNovoRequest usuarioNovo) {
        log.info("[inicia] UsuarioServicee - criaNovoUsuario");
        Usuario usuario = usuarioRepository.salva(new Usuario(usuarioNovo));
        log.info("[finaliza] UsuarioService - criaNovoUsuario");
        return UsuarioCriadoResponse.builder()
                .idUsuario(usuario.getIdUsuario())
                .build();
    }

    @Override
    public UsuarioCriadoResponse buscaUsuarioPorId(UUID idUsuario) {
        log.info("[inicia] UsuarioServicee - deletaUsuarioUsandoId");
        UsuarioCriadoResponse buscaUsuario = usuarioRepository.buscaUsuarioPorId(idUsuario);
        log.info("[finaliza] UsuarioService - deletaUsuarioUsandoId");
        return buscaUsuario;
    }

    @Override
    public void deletaUsuarioUsandoId(UUID idUsuario) {
        log.info("[inicia] UsuarioServicee - deletaUsuarioUsandoId");
        usuarioRepository.deleta(idUsuario);
        log.info("[finaliza] UsuarioService - deletaUsuarioUsandoId");
    }
}
