package br.com.nativos.produtivos.usuario.aplication.api;

import lombok.Value;
import org.springframework.data.annotation.Id;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.UUID;
@Value
public class UsuarioNovoRequest {
    @Email
    private final String email;
    @Size(min = 6)
    private final String senha;
}