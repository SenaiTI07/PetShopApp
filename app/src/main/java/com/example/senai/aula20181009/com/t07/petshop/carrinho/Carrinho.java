package com.example.senai.aula20181009.com.t07.petshop.carrinho;

import com.example.senai.aula20181009.com.t07.petshop.produto.IProduto;

import java.util.ArrayList;

/**
 * Created by senai on 09/10/2018.
 */

public class Carrinho {
    public static final int ABERTO = 0;
    public static final int FECHADO = 1;
    public static final int PAGO = 2;
    private ArrayList<IProduto> aProdutos;
    private int status;
    public static final Carrinho instancia =
            new Carrinho();
    public static Carrinho getInstancia(){
        return instancia;
    }
    private Carrinho() {
        this.aProdutos = new ArrayList<>();
        this.status = ABERTO;
    }
    public boolean inserirProduto(IProduto p){
        if(this.status == ABERTO){
            return this.aProdutos.add(p);
        }
        return false;
    }
    public IProduto excluirProduto(int id){
        if(this.status == ABERTO) {
            return this.aProdutos.remove(id);
        }
        return null;
    }
    public IProduto excluirProduto(IProduto p){
        return excluirProduto(
                this.aProdutos.lastIndexOf(p));
    }
    public ArrayList<IProduto> getaProdutos(){

        return this.aProdutos;

    }
    public float getValorTotal(){
        float valorTotal = 0;
        for(IProduto p:this.aProdutos){
            valorTotal += p.getPreco();
        }
        return valorTotal;
    }
    public boolean finalizar(){
        if(this.status == ABERTO) {
            this.status = FECHADO;
            return true;
        }
        return false;
    }
    public boolean pagar(){
        if(this.status == FECHADO) {
            this.status = PAGO;
            return true;
        }
        return false;
    }
}
