package grupod.activitymanagerapi.Entities;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author iego_
 */
public class Funcionario {
    
    private long id;
    private String nome;
    private String apelido;
    private byte foto;
    private String corFavorita;
    private Date dataNascimento;
    private boolean ativo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public byte getFoto() {
        return foto;
    }

    public void setFoto(byte foto) {
        this.foto = foto;
    }

    public String getCorFavorita() {
        return corFavorita;
    }

    public void setCorFavorita(String corFavorita) {
        this.corFavorita = corFavorita;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
}
