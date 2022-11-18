package br.com.nativos.produtivos.usuario.aplication.service;

import br.com.nativos.produtivos.usuario.aplication.api.UsuarioCriadoResponse;
import br.com.nativos.produtivos.usuario.aplication.api.UsuarioNovoRequest;
import br.com.nativos.produtivos.usuario.domain.Usuario;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class UsuarioService implements UsuarioAplicationService {
    @Override
    public UsuarioCriadoResponse criaNovoUsuario(UsuarioNovoRequest usuarioNovo) {
        log.info("[inicio] UsuarioService - criaNovoUsuario");
        Usuario usuario = new Usuario(usuarioNovo);
        log.info("[final] UsuarioService - criaNovoUsuario");
        return new UsuarioCriadoResponse(usuario);
    }
}
