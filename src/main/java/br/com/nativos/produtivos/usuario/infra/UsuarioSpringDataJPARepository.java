package br.com.nativos.produtivos.usuario.infra;


import br.com.nativos.produtivos.usuario.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioSpringDataJPARepository extends JpaRepository<Usuario, UUID> {
}
