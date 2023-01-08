package br.com.nativos.produtivos.produto.application.api;

import br.com.nativos.produtivos.produto.domain.TIPO;
import lombok.Getter;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.UUID;
@Getter
public class ProdutoResponse {
        @Id
        private UUID id;
        @NotBlank
        private String nome;
        private TIPO tipo;
}
