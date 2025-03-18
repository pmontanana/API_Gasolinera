package com.DAW2.gasolinera.service;

import com.DAW2.gasolinera.model.Producto;
import com.DAW2.gasolinera.model.Tanque;
import java.util.List;

public interface ITanqueService {
    
    public List<Tanque> getTanques();

    public void saveTanque(Tanque tanque);

    public void deleteTanque(Long idTanque);

    public Tanque findTanque(Long idTanque);

    public void editTanque(Long idOriginal,
                          String nuevoCodigo,
                          Integer nuevaCapacidadMaxima,
                          Integer nuevoNivelActual,
                          Producto nuevoProducto);
}

