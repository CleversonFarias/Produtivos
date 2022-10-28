package br.com.nativos.produtivos.credencial.domain;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Builder
@Document(collation = "Credencial")
public class Credencial {
    @MongoId(targetType = FieldType.STRING)
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
