package br.com.nativos.produtivos.usuario.aplication.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping(value = "/v1/usuario")
public interface UsuarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    UsuarioCriadoResponse criaNovoUsuario(@Valid @RequestBody UsuarioNovoRequest usuarioNovo);

    @DeleteMapping (value = "/{idUsuario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaUsuarioPeloID(@PathVariable UUID idUsuario);

//    List<UsuarioCriadoResponse> listaTodosUsuarios(@Valid @RequestBody UsuarioNovoRequest usuarioNovo);
}
