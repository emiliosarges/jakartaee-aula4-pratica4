package br.jsf;

import br.data.model.Produto;
import br.ejb.EjbProduto;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.List;

@Named(value="jsfProduto")
@RequestScoped
public class JsfProduto {

    @EJB
    private EjbProduto ejbProduto;

    public JsfProduto(){}

    public List<Produto> getAll(){
        return ejbProduto.getAll();
    }

}
