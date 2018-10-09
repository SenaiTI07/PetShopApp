package com.example.senai.aula20181009.com.t07.petshop.produto;

import java.util.Date;

/**
 * Created by senai on 09/10/2018.
 */

public interface IProdutoPerecivel
extends  IProduto{
    Date getDataValidade();
    float getTempMin();
    float getTempMax();
    int getDuracaoDias();
}
