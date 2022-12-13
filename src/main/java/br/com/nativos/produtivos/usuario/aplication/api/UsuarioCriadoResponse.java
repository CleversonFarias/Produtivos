package br.com.nativos.produtivos.usuario.aplication.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;
@Builder
@Value
public class UsuarioCriadoResponse {
    private UUID idUsuario;

//    public UsuarioCriadoResponse(Usuario usuario) {
//        this.idUsuario = usuario.getIdUsuario();
//        this.email = usuario.getEmail();
//    }
}