package br.data.crud;


import br.data.model.Produto;

import java.util.ArrayList;

public class CrudProduto {

    public ArrayList<Produto> getAll(){
        ArrayList<Produto> lprod = new ArrayList<>();
        lprod.add(new Produto(1, "Computador"));
        lprod.add(new Produto(2, "Monitor"));
        lprod.add(new Produto(3, "Mouse"));
        lprod.add(new Produto(4, "Teclado"));
        lprod.add(new Produto(5, "WebCam"));

        return lprod;
    };
}
