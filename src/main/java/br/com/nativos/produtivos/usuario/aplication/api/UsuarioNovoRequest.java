package br.com.nativos.produtivos.usuario.aplication.api;

import lombok.Value;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Value
public class UsuarioNovoRequest {
    @NotBlank
    @Email
    private String email;
    @Size(min = 6)
    private String senha;
    private String nome;
}
