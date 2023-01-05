package br.com.nativos.produtivos.usuario.aplication.api;

import lombok.Value;

import javax.validation.constraints.NotBlank;
@Value
public class UsuarioAlteracaoRequest {
        @NotBlank
        private String nome;
    }

