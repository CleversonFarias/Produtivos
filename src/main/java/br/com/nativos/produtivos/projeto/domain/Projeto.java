package br.com.nativos.produtivos.projeto.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Document(collection = "Projeto")
public class Projeto {
   @Id
   private UUID idProjeto;
   @Indexed
   private UUID idUsuario;
   private String nome;
   private String descricao;

}




