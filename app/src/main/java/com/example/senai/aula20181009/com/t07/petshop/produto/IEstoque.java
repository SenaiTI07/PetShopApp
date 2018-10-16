package com.example.senai.aula20181009.com.t07.petshop.produto;

import java.util.HashMap;

/**
 * Created by senai on 16/10/2018.
 */

public interface IEstoque {
    HashMap<IProduto,Integer> getProdutos();
    boolean armazenarProduto
            (IProduto p, int qtd);
    int verificaQuantidadeProduto(IProduto p);
    boolean retirarProduto
            (IProduto p, int qtd);
}
