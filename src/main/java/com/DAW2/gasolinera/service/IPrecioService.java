package com.DAW2.gasolinera.service;

import com.DAW2.gasolinera.model.Precio;
import com.DAW2.gasolinera.model.Producto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface IPrecioService {
    
    public List<Precio> getPrecios();

    public void savePrecio(Precio precio);

    public void deletePrecio(Long idPrecio);

    public Precio findPrecio(Long idPrecio);

    public void editPrecio(Long idOriginal, Producto nuevoProducto, LocalDate nuevaFechaInicio, LocalDate nuevaFechaFin, BigDecimal nuevoPrecioPorLitro);
}

