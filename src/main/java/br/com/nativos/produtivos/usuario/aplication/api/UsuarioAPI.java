package br.com.nativos.produtivos.usuario.aplication.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/v1/usuario")
public interface UsuarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    UsuarioCriadoResponse criaNovoUsuario(@Valid @RequestBody UsuarioNovoRequest usuarioNovo);

    @GetMapping(value = "/{idUsuario}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    UsuarioCriadoDetalhado buscaUsuarioPorId (@PathVariable UUID idUsuario);

    @GetMapping
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    List<UsuarioListResponse> listaTodosUsuarios();

    @DeleteMapping(value = "/{idUsuario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaUsuarioPeloID(@PathVariable UUID idUsuario);

    @PatchMapping(value = "/{idUsuario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT )
    void alteraUsuario (@PathVariable UUID idUsuario, @Valid @RequestBody UsuarioAlteracaoRequest usuarioAlteracaoRequest);
}
