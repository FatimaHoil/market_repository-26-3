package com.tecnm.merida.marketbackendv2263.persistence.entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "compras_productos")

public class CompraProducto {

    //Viene de otra clase
    @EmbeddedId
    private CompraProductoPK id;

    private Integer Cantidad;
    private Double total;
    private Boolean estado;

    private LocalDateTime fecha;

    public CompraProductoPK getId() {
        return id;
    }

    public void setId(CompraProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer cantidad) {
        Cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
