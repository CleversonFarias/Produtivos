package br.com.nativos.produtivos.produto.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/usuario/{idUsuario}/produto")
public interface ProdutoApi {
    @PostMapping
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    ProdutoResponse criaProduto(@Valid @RequestBody ProdutoRequest produtoRequest);




}
