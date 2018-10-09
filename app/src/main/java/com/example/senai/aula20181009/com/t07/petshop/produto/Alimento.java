package com.example.senai.aula20181009.com.t07.petshop.produto;

import java.util.Date;

/**
 * Created by senai on 09/10/2018.
 */

public class Alimento
        extends AbstractProdutoPerecivel
{

    public Alimento(String nome,
                    String descricao,
                    String sImagem,
                    float preco,

                    Date dataValidade,
                    float tempMin,
                    float tempMax,
                    int duracaoDias) {
        super(nome, descricao, sImagem,
                preco, IProduto.ALIMENTO,
                dataValidade,
                tempMin, tempMax, duracaoDias);
    }
}
