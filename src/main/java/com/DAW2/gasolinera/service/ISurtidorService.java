package com.DAW2.gasolinera.service;

import com.DAW2.gasolinera.model.Surtidor;
import java.time.LocalDate;
import java.util.List;

public interface ISurtidorService {
    
    public List<Surtidor> getSurtidores();

    public void saveSurtidor(Surtidor surtidor);

    public void deleteSurtidor(Long idSurtidor);

    public Surtidor findSurtidor(Long idSurtidor);

    public void editSurtidor(Long idOriginal,
                            String nuevoCodigo,
                            LocalDate nuevaFechaInstalacion,
                            boolean nuevoActivo);
}

