package org.example.proyectoalquilervehiculos;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Servicios")
public class Servicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idServicio;

    @Column(nullable = false)
    private Date fechaInicio;

    @Column(nullable = false)
    private Date fechaFin;

    @Column(nullable = false)
    private Integer kilometrajeServicio;

    @Column(nullable = false)
    private Boolean finalizado = false;

    @Column(nullable = false)
    private Float precio;

    @ManyToOne
    @JoinColumn(name = "idVehiculo")
    private Vehiculo vehiculo;

    @ManyToOne
    @JoinColumn(name = "idConductor")
    private Conductor conductor;

    public Servicios() {
    }

    public Servicios(Integer idServicio, Date fechaInicio, Date fechaFin, Integer kilometrajeServicio, Boolean finalizado, Float precio, Vehiculo vehiculo, Conductor conductor) {
        this.idServicio = idServicio;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.kilometrajeServicio = kilometrajeServicio;
        this.finalizado = finalizado;
        this.precio = precio;
        this.vehiculo = vehiculo;
        this.conductor = conductor;
    }

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getKilometrajeServicio() {
        return kilometrajeServicio;
    }

    public void setKilometrajeServicio(Integer kilometrajeServicio) {
        this.kilometrajeServicio = kilometrajeServicio;
    }

    public Boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}
