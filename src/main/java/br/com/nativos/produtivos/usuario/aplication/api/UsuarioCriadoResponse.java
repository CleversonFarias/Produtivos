package br.com.nativos.produtivos.usuario.aplication.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class UsuarioCriadoResponse {
    private UUID idUsuario;
    private  String nome;
}