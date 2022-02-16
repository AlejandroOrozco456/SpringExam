package com.example.ventaMateriales.models;

import javax.persistence.*;

@Entity
@Table(name="cuentas")
public class Cuentas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    private Float Deuda;
    private Float Disponible;
    private String pagos;
    public Float getDeuda() {
        return Deuda;
    }
    public void setDeuda(Float deuda) {
        Deuda = deuda;
    }
    public Float getDisponible() {
        return Disponible;
    }
    public void setDisponible(Float disponible) {
        Disponible = disponible;
    }
    public String getPagos() {
        return pagos;
    }
    public void setPagos(String pagos) {
        this.pagos = pagos;
    }
    
    
}
