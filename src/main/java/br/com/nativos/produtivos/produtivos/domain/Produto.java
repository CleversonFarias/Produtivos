package br.com.nativos.produtivos.produtivos.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produto {
    @Id
    private UUID idProduto;
    private String tipo;
    private String nome;
    private double preco;
    private String validade;
    private LocalDateTime dataEntrada = LocalDateTime.now();
    private LocalDateTime dataSaida = LocalDateTime.now();
    private StatusDoProduto statusDoProduto = StatusDoProduto.DISPONIVEL;
    private UUID idUsuario;
}
