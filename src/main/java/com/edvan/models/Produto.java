package com.edvan.models;

public class Produto {
    private Integer codigo;
    private String nome;
    private Integer estoque;

    @Override
    public String toString() {
        return "Produto{" +
                "código=" + codigo +
                ", nome='" + nome + '\'' +
                ", estoque=" + estoque +
                '}';
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
}
