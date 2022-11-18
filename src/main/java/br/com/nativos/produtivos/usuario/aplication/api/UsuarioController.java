package br.com.nativos.produtivos.usuario.aplication.api;

import br.com.nativos.produtivos.usuario.aplication.service.UsuarioAplicationService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class UsuarioController implements UsuarioAPI {
    private final UsuarioAplicationService usuarioAplicationService;

    @Override
    public UsuarioCriadoResponse postNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo) {
       log.info("[inicio] UsuarioController - postNovoUsuario");
       UsuarioCriadoResponse usuarioCriado = usuarioAplicationService.criaNovoUsuario(usuarioNovo);
       log.info("[final] UsuarioController - postNovoUsuario");
       return usuarioCriado;
    }
}
