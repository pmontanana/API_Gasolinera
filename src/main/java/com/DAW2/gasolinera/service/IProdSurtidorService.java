package com.DAW2.gasolinera.service;

import com.DAW2.gasolinera.model.Producto;
import com.DAW2.gasolinera.model.Surtidor;
import com.DAW2.gasolinera.model.ProdSurtidor;
import java.util.List;

public interface IProdSurtidorService {
    
    public List<ProdSurtidor> getProdSurtidor();

    public void saveProdSurtidor(ProdSurtidor prodSurtidor);

    public void deleteProdSurtidor(Long idProdSurtidor);

    public ProdSurtidor findProdSurtidor(Long idProdSurtidor);

    public void editProdSurtidor(Long idOriginal, Surtidor nuevoSurtidor, Producto nuevoProducto);
}

