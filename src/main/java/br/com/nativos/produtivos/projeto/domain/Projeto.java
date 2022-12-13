package br.com.nativos.produtivos.projeto.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Projeto {
   @Id
   private UUID idProjeto;
   private UUID idUsuario;
   private String nome;
   private String descricao;

}




