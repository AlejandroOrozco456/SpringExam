package com.example.ventaMateriales.models;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    private String nombre;
    private String username;
    private String password;
    private String hEntrada;
    private String hSlida;
    private String Tipo;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String gethEntrada() {
        return hEntrada;
    }
    public void sethEntrada(String hEntrada) {
        this.hEntrada = hEntrada;
    }
    public String gethSlida() {
        return hSlida;
    }
    public void sethSlida(String hSlida) {
        this.hSlida = hSlida;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    

}
