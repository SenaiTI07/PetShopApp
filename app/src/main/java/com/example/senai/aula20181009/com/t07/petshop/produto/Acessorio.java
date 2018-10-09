package com.example.senai.aula20181009.com.t07.petshop.produto;

/**
 * Created by senai on 09/10/2018.
 */

public class Acessorio
extends  AbstractProduto{
    public Acessorio(String nome,
                     String descricao,
                     String sImagem,
                     float preco) {
        super(nome, descricao, sImagem,
                preco, IProduto.ACESSORIO);
    }
}
