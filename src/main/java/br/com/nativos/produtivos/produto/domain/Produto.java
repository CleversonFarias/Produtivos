package br.com.nativos.produtivos.produto.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Produto")
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
