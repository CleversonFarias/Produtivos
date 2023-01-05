package br.com.nativos.produtivos.usuario.infra;

import br.com.nativos.produtivos.handler.APIException;
import br.com.nativos.produtivos.usuario.aplication.service.UsuarioRepository;
import br.com.nativos.produtivos.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

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
    @Override
    public Usuario buscaUsuarioPorId(UUID idUsuario) {
        log.info("[inicia] UsuarioInfraRepository - buscaUsuarioPorId");
        Usuario buscaUsuario = usuarioSpringDataJPARepository.findById(idUsuario)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Cliente não encontrado!"));
        log.info("[final] UsuarioInfraRepository - buscaUsuarioPorId");
        return buscaUsuario;
    }
    @Override
    public List<Usuario> buscaTodosUsuarios() {
        log.info("[inicia] UsuarioInfraRepository - buscaTodosUsuarios");
        List<Usuario> buscaUsuarios = usuarioSpringDataJPARepository.findAll();
        log.info("[finaliza] UsuarioInfraRepository - buscaTodosUsuarios");
        return buscaUsuarios;
    }

    @Override
    public void deleta(UUID idUsuario) {
        log.info("[inicia] UsuarioInfraRepository - deleta");
        log.info("[IdUsuario]", idUsuario);
        usuarioSpringDataJPARepository.deleteById(idUsuario);
        log.info("[final] UsuarioInfraRepository - deleta");
    }
}