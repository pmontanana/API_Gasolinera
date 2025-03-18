package com.DAW2.gasolinera.service;

import com.DAW2.gasolinera.model.Producto;
import com.DAW2.gasolinera.model.Suministro;
import com.DAW2.gasolinera.model.Surtidor;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface ISuministroService {
    
    public List<Suministro> getSuministros();

    public void saveSuministro(Suministro suministro);

    public void deleteSuministro(Long idSuministro);

    public Suministro findSuministro(Long idSuministro);

    public void editSuministro(Long idOriginal,
                              Surtidor nuevoSurtidor,
                              Producto nuevoProducto,
                              LocalDateTime nuevaFechaHora,
                              BigDecimal nuevoVolumenLitros,
                              BigDecimal nuevoImporteEuros);
}

