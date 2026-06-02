package br.ejb;

import br.data.crud.CrudProduto;
import br.data.model.Produto;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class EjbProduto {


    public List<Produto> getAll(){
        return new  CrudProduto().getAll();
    }

}
