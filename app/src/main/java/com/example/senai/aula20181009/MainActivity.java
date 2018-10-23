package com.example.senai.aula20181009;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.senai.aula20181009.com.t07.petshop.BancoMock;
import com.example.senai.aula20181009.com.t07.petshop.carrinho.Carrinho;
import com.example.senai.aula20181009.com.t07.petshop.produto.Estoque;
import com.example.senai.aula20181009.com.t07.petshop.produto.IProduto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainActivity
        extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BancoMock.getInstancia();
        mostrarProdutos();
    }
    private void mostrarProdutos(){
        LinearLayout layout =
                findViewById(R.id.layout_produtos);
        HashMap<IProduto, Integer> lista =
                Estoque.getInstance().getProdutos();
        Iterator it = lista.entrySet().iterator();

        Log.d("MainActivity", "iterator " + it.toString());
        while(it.hasNext()){
            Map.Entry produtoQtd =
                    (Map.Entry)it.next();
            final IProduto p = (IProduto)produtoQtd.
                    getKey();
            final int qtd = (Integer)produtoQtd.
                    getValue();
            //layout
            LayoutInflater inflater =
                    LayoutInflater.from(this);
            RelativeLayout itemLayout =
                    (RelativeLayout)inflater.inflate(
                            R.layout.layout_item,
                            null,false);
            TextView titulo =(TextView)
                    itemLayout.findViewById(R.id.tvNome);
            titulo.setText(p.getNome());
            TextView preco = (TextView)
                    itemLayout.findViewById(R.id.tvPreco);
            preco.setText(String.valueOf(p.getPreco()));
            layout.addView(itemLayout);
            it.remove();
        }
    }

    public void clicouCarrinho(View view) {
        Intent i = new Intent
                (this, CarrinhoActivity.class);
        startActivity(i);
    }
}
