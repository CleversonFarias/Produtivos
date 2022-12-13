package br.com.nativos.produtivos.credencial.domain;

import lombok.Builder;
import lombok.Getter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@Entity
public class Credencial {
    @Id
    @Getter
    private String usuario;
    private String senha;


    private Credencial(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = new BCryptPasswordEncoder().encode(senha);
    }

    public String getPassword() {
        return senha;
    }
}
