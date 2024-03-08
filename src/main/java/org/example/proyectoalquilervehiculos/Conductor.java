package org.example.proyectoalquilervehiculos;
public class Conductor {
    private String nombre;
    private String ap1;
    private String ap2;
    private String id;
    private String tipoCarnet;
    private int aniosCarnet;

    // Constructor
    public Conductor(String nombre, String apellidos, String id, String tipoCarnet, int aniosCarnet) {
        this.nombre = nombre;
        this.ap1 = ap1;
        this.ap2 = ap2;
        this.id = id;
        this.tipoCarnet = tipoCarnet;
        this.aniosCarnet = aniosCarnet;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp1() {
        return ap1;
    }

    public void setAp1(String ap1) {
        this.ap1 = ap1;
    }

    public String getAp2() {
        return ap2;
    }

    public void setAp2(String ap2) {
        this.ap2 = ap2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoCarnet() {
        return tipoCarnet;
    }

    public void setTipoCarnet(String tipoCarnet) {
        this.tipoCarnet = tipoCarnet;
    }

    public int getAniosCarnet() {
        return aniosCarnet;
    }

    public void setAniosCarnet(int aniosCarnet) {
        this.aniosCarnet = aniosCarnet;
    }
}

