package br.com.nativos.produtivos.produto.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
public class Produto {
    @Id
    private UUID id;
    @NotBlank
    private String nome;
    private TIPO tipo;
    @NotBlank
    private double precoVarejo;
    private double precoAtacado;
    @NotBlank
    private double estoque;
    private double saida;
    private double desconto;
}
