package com.example.clientes.model;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String nome;
    private String email;
    private String idade;
    private String url_foto;
    //private String key;

    public Cliente(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail(){return email;}

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getUrl_foto() {
        return url_foto;
    }

    public void setUrl_foto(String url_foto) {
        this.url_foto = url_foto;
    }

    //public String getKey() {
        //return key;
    //}

   // public void setKey(String key) {
        //this.key = key;
    //}

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", idade='" + idade + '\'' +
                ", url_foto='" + url_foto + '\'' +
                /*", key='" + key + '''*/ +
                '}';
    }
}





