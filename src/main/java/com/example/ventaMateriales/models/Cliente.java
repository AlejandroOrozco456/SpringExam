package com.example.ventaMateriales.models;

import javax.persistence.*;

@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    private String nombre;
    private Float credito;
    private Float deuda;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Float getCredito() {
        return credito;
    }
    public void setCredito(Float credito) {
        this.credito = credito;
    }
    public Float getDeuda() {
        return deuda;
    }
    public void setDeuda(Float deuda) {
        this.deuda = deuda;
    }
    

}
