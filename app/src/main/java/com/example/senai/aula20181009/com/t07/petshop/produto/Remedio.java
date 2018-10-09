package com.example.senai.aula20181009.com.t07.petshop.produto;

import java.util.Date;

/**
 * Created by senai on 09/10/2018.
 */

public class Remedio
extends  AbstractProdutoPerecivel
{
    public static final int TARJA_VERMELHA = 0;
    public static final int TARJA_PRETA = 1;
    private String codigo;
    private int tipoTarja;

    public Remedio(String nome,
                   String descricao,
                   String sImagem,
                   float preco,
                   //int tipo,
                   Date dataValidade,
                   float tempMin,
                   float tempMax,
                   int duracaoDias,
                   String codigo,
                   int tipoTarja) {
        super(nome, descricao, sImagem,
                preco, IProduto.REMEDIO,
                dataValidade,
                tempMin, tempMax, duracaoDias);
        this.codigo = codigo;
        this.tipoTarja = tipoTarja;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getTipoTarja() {
        return tipoTarja;
    }
}
