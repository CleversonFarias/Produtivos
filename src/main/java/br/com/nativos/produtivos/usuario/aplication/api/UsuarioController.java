package br.com.nativos.produtivos.usuario.aplication.api;

import br.com.nativos.produtivos.usuario.aplication.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class UsuarioController implements UsuarioAPI {
    private final UsuarioService usuarioService;

    @Override
    public UsuarioCriadoResponse criaNovoUsuario(UsuarioNovoRequest usuarioNovo) {
       log.info("[inicio] UsuarioController - postNovoUsuario");
       UsuarioCriadoResponse usuarioCriado = usuarioService.criaNovoUsuario(usuarioNovo);
       log.info("[final] UsuarioController - postNovoUsuario");
       return usuarioCriado;
    }

    @Override
    public UsuarioCriadoResponse buscaUsuarioPorId(UUID idUsuario) {
        log.info("[inicio] UsuarioController - buscaUsuarioPorId");
        UsuarioCriadoResponse usuario = usuarioService.buscaUsuarioPorId(idUsuario);
        log.info("[final] UsuarioController - buscaUsuarioPorId");
        return usuario;
    }

    @Override
    public void deletaUsuarioPeloID(UUID idUsuario) {
        log.info("[inicio] UsuarioController - deletaUsuarioPeloID");
        usuarioService.deletaUsuarioUsandoId(idUsuario);
        log.info("[final] UsuarioController - deletaUsuarioPeloID");

    }
}
