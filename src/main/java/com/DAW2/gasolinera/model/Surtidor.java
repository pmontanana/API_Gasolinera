package com.DAW2.gasolinera.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "surtidores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Surtidor {
    public Long getIdSurtidor() {
        return idSurtidor;
    }

    public void setIdSurtidor(Long idSurtidor) {
        this.idSurtidor = idSurtidor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(LocalDate fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<ProdSurtidor> getProdSurtidor() {
        return prodSurtidor;
    }

    public void setProdSurtidor(List<ProdSurtidor> prodSurtidor) {
        this.prodSurtidor = prodSurtidor;
    }

    public List<Suministro> getSuministros() {
        return suministros;
    }

    public void setSuministros(List<Suministro> suministros) {
        this.suministros = suministros;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSurtidor;

    @Column(nullable = false, unique = true)
    private String codigo;

    @Column(name = "fecha_instalacion")
    private LocalDate fechaInstalacion;

    private boolean activo;

    @OneToMany(mappedBy = "surtidor", cascade = CascadeType.ALL)
    private List<ProdSurtidor> prodSurtidor = new ArrayList<>();

    @OneToMany(mappedBy = "surtidor", cascade = CascadeType.ALL)
    private List<Suministro> suministros = new ArrayList<>();
}