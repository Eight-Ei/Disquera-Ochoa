package com.afop.disquera.model;

public class Disquera {
    private int idDisquera;
    private String nitDisquera;
    private String nombreDisquera;
    private String telefonoDisquera;
    private String direccionDisquera;
    private Boolean estadoDisquera;

    public Disquera() {}

    public Disquera(int idDisquera, String nitDisquera, String nombreDisquera, String telefonoDisquera, String direccionDisquera, Boolean estadoDisquera) {
        this.idDisquera = idDisquera;
        this.nitDisquera = nitDisquera;
        this.nombreDisquera = nombreDisquera;
        this.telefonoDisquera = telefonoDisquera;
        this.direccionDisquera = direccionDisquera;
        this.estadoDisquera = estadoDisquera;
    }

    public int getIdDisquera() {
        return idDisquera;
    }

    public void setIdDisquera(int idDisquera) {
        this.idDisquera = idDisquera;
    }

    public String getNitDisquera() {
        return nitDisquera;
    }

    public void setNitDisquera(String nitDisquera) {
        this.nitDisquera = nitDisquera;
    }

    public String getNombreDisquera() {
        return nombreDisquera;
    }

    public void setNombreDisquera(String nombreDisquera) {
        this.nombreDisquera = nombreDisquera;
    }

    public String getTelefonoDisquera() {
        return telefonoDisquera;
    }

    public void setTelefonoDisquera(String telefonoDisquera) {
        this.telefonoDisquera = telefonoDisquera;
    }

    public String getDireccionDisquera() {
        return direccionDisquera;
    }

    public void setDireccionDisquera(String direccionDisquera) {
        this.direccionDisquera = direccionDisquera;
    }

    public Boolean getEstadoDisquera() {
        return estadoDisquera;
    }

    public void setEstadoDisquera(Boolean estadoDisquera) {
        this.estadoDisquera = estadoDisquera;
    }

    // Métodos adicionales
    public void listar() {}
    public void registrar() {}
    public void eliminar(int id) {}
    public void consultaId(int id) {}
    public void actualizar(int id) {}
    public void cambiarEstado() {}
}
