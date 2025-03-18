package com.DAW2.gasolinera.controller;

import com.DAW2.gasolinera.model.Producto;
import com.DAW2.gasolinera.model.Surtidor;
import com.DAW2.gasolinera.model.ProdSurtidor;
import com.DAW2.gasolinera.service.IProductoService;
import com.DAW2.gasolinera.service.IProdSurtidorService;
import com.DAW2.gasolinera.service.ISurtidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ProdSurtidorController {

    @Autowired
    private IProdSurtidorService prodSurtidorService;

    @Autowired
    private ISurtidorService surtidorService;

    @Autowired
    private IProductoService productoService;

    @GetMapping("/surtidor-productos/traer")
    public List<ProdSurtidor> getProdSurtidor() {
        return prodSurtidorService.getProdSurtidor();
    }

    @GetMapping("/surtidor-productos/traer/{id}")
    public ProdSurtidor getProdSurtidor(@PathVariable Long id) {
        return prodSurtidorService.findProdSurtidor(id);
    }

    @PostMapping("/surtidor-productos/crear")
    public String saveProdSurtidor(@RequestBody ProdSurtidor prodSurtidor) {
        prodSurtidorService.saveProdSurtidor(prodSurtidor);
        return "La relación surtidor-producto fue creada correctamente";
    }

    @DeleteMapping("/surtidor-productos/borrar/{id}")
    public String deleteProdSurtidor(@PathVariable Long id) {
        prodSurtidorService.deleteProdSurtidor(id);
        return "La relación surtidor-producto fue eliminada correctamente";
    }

    @PutMapping("/surtidor-productos/editar/{idOriginal}")
    public ProdSurtidor editProdSurtidor(@PathVariable Long idOriginal,
                                                 @RequestParam(required = false, name = "idSurtidor") Long idSurtidor,
                                                 @RequestParam(required = false, name = "idProducto") Long idProducto) {

        Surtidor surtidor = null;
        if (idSurtidor != null) {
            surtidor = surtidorService.findSurtidor(idSurtidor);
        }

        Producto producto = null;
        if (idProducto != null) {
            producto = productoService.findProducto(idProducto);
        }

        prodSurtidorService.editProdSurtidor(idOriginal, surtidor, producto);

        return prodSurtidorService.findProdSurtidor(idOriginal);
    }

    @PutMapping("/surtidor-productos/editar")
    public ProdSurtidor editProdSurtidor(@RequestBody ProdSurtidor prodSurtidor) {
        prodSurtidorService.editProdSurtidor(
                prodSurtidor.getIdProdSurtidor(),
                prodSurtidor.getSurtidor(),
                prodSurtidor.getProducto()
        );

        return prodSurtidorService.findProdSurtidor(prodSurtidor.getIdProdSurtidor());
    }
}