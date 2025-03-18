package com.DAW2.gasolinera.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "producto_surtidor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdSurtidor {
    public Long getIdProdSurtidor() {
        return idProdSurtidor;
    }

    public void setIdProdSurtidor(Long idProdSurtidor) {
        this.idProdSurtidor = idProdSurtidor;
    }

    public Surtidor getSurtidor() {
        return surtidor;
    }

    public void setSurtidor(Surtidor surtidor) {
        this.surtidor = surtidor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProdSurtidor;

    @ManyToOne
    @JoinColumn(name = "id_surtidor", nullable = false)
    private Surtidor surtidor;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;
}