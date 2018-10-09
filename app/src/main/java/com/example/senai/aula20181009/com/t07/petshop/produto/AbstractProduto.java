package com.example.senai.aula20181009.com.t07.petshop.produto;

/**
 * Created by senai on 09/10/2018.
 */

public abstract class
AbstractProduto
implements IProduto {
    private String nome,
    descricao, sImagem;
    private float preco;
    private int tipo;

    public AbstractProduto(String nome,
                           String descricao,
                           String sImagem,
                           float preco,
                           int tipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.sImagem = sImagem;
        this.preco = preco;
        this.tipo = tipo;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public float getPreco() {
        return this.preco;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public int getTipo() {
        return this.tipo;
    }

    @Override
    public String getImagem() {
        return this.sImagem;
    }
}
