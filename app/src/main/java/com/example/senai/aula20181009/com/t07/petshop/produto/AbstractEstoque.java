package com.example.senai.aula20181009.com.t07.petshop.produto;

import java.util.HashMap;

/**
 * Created by senai on 16/10/2018.
 */

public class AbstractEstoque
        implements IEstoque {
    HashMap<IProduto,Integer> hEstoque;
    public AbstractEstoque(){
        this.hEstoque = new HashMap<>();
    }
    @Override
    public HashMap<IProduto, Integer>
    getProdutos() {
        return hEstoque;
    }

    @Override
    public boolean armazenarProduto
            (IProduto p, int qtd) {
        if(this.hEstoque.containsKey(p)){
            Integer i = this.hEstoque.get(p);
            i+=qtd;
            this.hEstoque.put(p,i);
            return true;
        }
        else{
            this.hEstoque.put(p,qtd);
            return true;
        }
        //return false;
    }

    @Override
    public int verificaQuantidadeProduto
            (IProduto p) {
        if(this.hEstoque.containsKey(p)){
            return this.hEstoque.get(p);
        }
        return 0;
    }

    @Override
    public boolean retirarProduto
            (IProduto p, int qtd) {
        if(this.hEstoque.containsKey(p) &&
                this.hEstoque.get(p) >= qtd){
            int i = this.hEstoque.get(p);
            i -= qtd;
            this.hEstoque.put(p,i);
            return true;
        }
        return false;
    }
}
