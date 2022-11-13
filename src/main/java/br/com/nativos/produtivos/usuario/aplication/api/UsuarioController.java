package br.com.nativos.produtivos.usuario.aplication.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@Log4j2
public class UsuarioController implements UsuarioAPI {

    @Override
    public UsuarioCriadoResponse postNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo) {
       log.info("[inicio] UsuarioController - postNovoUsuario");
     //  UsuarioCriadoResponse usuarioCriado = postNovoUsuario.criaNovoUsuarioPorId(IdUsuario);
      // log.info("[final] UsuarioController - postNovoUsuario");
        return null;
    }
}
