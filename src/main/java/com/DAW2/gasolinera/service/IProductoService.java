package com.DAW2.gasolinera.service;

import com.DAW2.gasolinera.model.Producto;
import java.util.List;

public interface IProductoService {

    public List<Producto> getProductos();

    public void saveProducto(Producto producto);

    public void deleteProducto(Long idProducto);

    public Producto findProducto(Long idProducto);

    public void editProducto(Long idOriginal,
                            String nuevoNombre,
                            String nuevaDescripcion,
                            String nuevoTipo);


}

