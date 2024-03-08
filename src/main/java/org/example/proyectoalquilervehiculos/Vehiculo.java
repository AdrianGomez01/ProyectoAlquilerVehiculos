package org.example.proyectoalquilervehiculos;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehiculo")
    private int idVehiculo;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "matricula")
    private String matricula;

    @Column(name = "kilometraje_coche")
    private int kilometrajeCoche;


    public Vehiculo(int idVehiculo, String marca, String modelo, String tipo, String matricula, int kilometrajeCoche) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.matricula = matricula;
        this.kilometrajeCoche = kilometrajeCoche;
    }

    public Vehiculo() {

    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getKilometrajeCoche() {
        return kilometrajeCoche;
    }

    public void setKilometrajeCoche(int kilometrajeCoche) {
        this.kilometrajeCoche = kilometrajeCoche;
    }
}
