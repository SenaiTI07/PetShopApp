package com.example.senai.aula20181009.com.t07.petshop.produto;

import java.util.Date;

/**
 * Created by senai on 09/10/2018.
 */

public abstract class AbstractProdutoPerecivel
extends AbstractProduto
        implements IProdutoPerecivel
{
    private Date dataValidade;
    private float tempMin, tempMax;
    private int duracaoDias;

    public AbstractProdutoPerecivel
            (String nome, String descricao,
             String sImagem, float preco,
             int tipo, Date dataValidade,
             float tempMin, float tempMax,
             int duracaoDias) {
        super(nome, descricao, sImagem, preco,
                tipo);
        this.dataValidade = dataValidade;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.duracaoDias = duracaoDias;
    }

    @Override
    public Date getDataValidade() {
        return dataValidade;
    }

    @Override
    public float getTempMin() {
        return tempMin;
    }

    @Override
    public float getTempMax() {
        return tempMax;
    }

    @Override
    public int getDuracaoDias() {
        return duracaoDias;
    }
}
