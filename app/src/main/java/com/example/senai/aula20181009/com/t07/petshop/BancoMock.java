package com.example.senai.aula20181009.com.t07.petshop;

import android.text.style.TtsSpan;

import com.example.senai.aula20181009.com.t07.petshop.produto.Acessorio;
import com.example.senai.aula20181009.com.t07.petshop.produto.Alimento;
import com.example.senai.aula20181009.com.t07.petshop.produto.Estoque;
import com.example.senai.aula20181009.com.t07.petshop.produto.Remedio;

import java.util.Date;

/**
 * Created by senai on 16/10/2018.
 */

public class BancoMock {
    private static final
    BancoMock instancia = new BancoMock();
    public static BancoMock getInstancia(){
        return instancia;
    }
    private BancoMock(){
        Acessorio a = new Acessorio(
                "Ossinho", "Osso de couro",
                "", 2.99f);
        Alimento al = new Alimento(
                "Racao Bom Sabor",
                "Racao para pitbull sabor bacon",
                "",10.99f, new Date(),5f, 60f,10);
        Remedio r = new Remedio(
                "Vermifugo", "Mata vermes",
                "", 15.50f, new Date(),
                6f, 40f, 3, "abc123",
                Remedio.TARJA_VERMELHA);
        Estoque.getInstance().
                armazenarProduto(a, 4);
        Estoque.getInstance().
                armazenarProduto(al, 10);
        Estoque.getInstance().
                armazenarProduto(r,2);
    }

}
