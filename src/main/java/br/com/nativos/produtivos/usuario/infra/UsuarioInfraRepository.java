package br.com.nativos.produtivos.usuario.infra;

import br.com.nativos.produtivos.usuario.aplication.service.UsuarioRepository;
import br.com.nativos.produtivos.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class UsuarioInfraRepository implements UsuarioRepository {
    private final UsuarioSpringDataJPARepository usuarioSpringDataJPARepository;

    @Override
    public Usuario salva(Usuario usuario) {
        log.info("[inicia] UsuarioInfraRepository - salva");
        usuarioSpringDataJPARepository.save(usuario);
        log.info("[finaliza] UsuarioInfraRepository - salva");
        return usuario;
    }
}