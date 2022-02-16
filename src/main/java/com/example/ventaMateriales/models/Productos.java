package com.example.ventaMateriales.models;

import javax.persistence.*;

@Entity
@Table(name="productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    private String nombre;
    private String descripcion;
    private Integer disponibles;
    private Integer vendidos;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getDisponibles() {
        return disponibles;
    }
    public void setDisponibles(Integer disponibles) {
        this.disponibles = disponibles;
    }
    public Integer getVendidos() {
        return vendidos;
    }
    public void setVendidos(Integer vendidos) {
        this.vendidos = vendidos;
    }

    
}
