package model;

import java.util.Date;

public class Usuario {
    private int pkusuario;
    private String nome;
    private String email;
    private String senha;
    private Date datanasc;
    private boolean ativo;

    
    public Usuario(){}
    
    public Usuario(int pkusuario, String nome, String email, String senha, Date datanasc, boolean ativo) {
        this.pkusuario = pkusuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.datanasc = datanasc;
        this.ativo = ativo;
    }

    public int getPkusuario() {
        return pkusuario;
    }

    public void setPkusuario(int pkusuario) {
        this.pkusuario = pkusuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getPkUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
