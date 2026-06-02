package br.jsf;

import br.data.model.ItemCompra;
import br.data.model.Produto;
import br.ejb.EjbCompra;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("jsfCompra")
@SessionScoped
public class JsfCompra implements Serializable {

    @EJB
    private EjbCompra ejbCompra;

    public JsfCompra() {}

    public void add(Produto produto){
        ejbCompra.add(produto);
    }

    public List<ItemCompra> getAll(){
        return ejbCompra.getAll();
    }

}
