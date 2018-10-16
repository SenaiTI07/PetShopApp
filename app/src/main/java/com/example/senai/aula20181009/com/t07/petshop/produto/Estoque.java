package com.example.senai.aula20181009.com.t07.petshop.produto;

/**
 * Created by senai on 16/10/2018.
 */

public class Estoque
extends AbstractEstoque{
    private static final Estoque
            instancia = new Estoque();
    public static Estoque getInstance()
    {
        return instancia;
    }

    private Estoque() {
        super();
    }
}
