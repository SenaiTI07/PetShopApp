package com.example.senai.aula20181009.com.t07.petshop.produto;

/**
 * Created by senai on 09/10/2018.
 */

public interface IProduto {
    int ALIMENTO = 0;
    int ACESSORIO = 1;
    int REMEDIO = 2;
    String getNome();
    float getPreco();
    String getDescricao();
    int getTipo();
    String getImagem();
}
