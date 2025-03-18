package com.DAW2.gasolinera.service;

import com.DAW2.gasolinera.model.Producto;
import com.DAW2.gasolinera.model.Surtidor;
import com.DAW2.gasolinera.model.ProdSurtidor;
import com.DAW2.gasolinera.repository.IProdSurtidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdSurtidorService implements IProdSurtidorService {
    
    @Autowired
    private IProdSurtidorRepository repoProdSurtidor;

    @Override
    public List<ProdSurtidor> getProdSurtidor() {
        List<ProdSurtidor> listaProdSurtidor = repoProdSurtidor.findAll();
        return listaProdSurtidor;
    }

    @Override
    public void saveProdSurtidor(ProdSurtidor prodSurtidor) {
        repoProdSurtidor.save(prodSurtidor);
    }

    @Override
    public void deleteProdSurtidor(Long idProdSurtidor) {
        repoProdSurtidor.deleteById(idProdSurtidor);
    }

    @Override
    public ProdSurtidor findProdSurtidor(Long idProdSurtidor) {
        return repoProdSurtidor.findById(idProdSurtidor).orElse(null);
    }

    @Override
    public void editProdSurtidor(Long idOriginal, Surtidor nuevoSurtidor,
                                    Producto nuevoProducto) {
        
        // busco el objeto original
        ProdSurtidor prodSurtidor = this.findProdSurtidor(idOriginal);
        
        // proceso de modificación a nivel lógico
        prodSurtidor.setSurtidor(nuevoSurtidor);
        prodSurtidor.setProducto(nuevoProducto);
        
        // guardar los cambios
        this.saveProdSurtidor(prodSurtidor);
    }
}

