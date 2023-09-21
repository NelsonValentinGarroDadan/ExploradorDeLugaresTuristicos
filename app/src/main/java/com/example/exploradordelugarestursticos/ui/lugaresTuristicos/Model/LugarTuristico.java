package com.example.exploradordelugarestursticos.ui.lugaresTuristicos.Model;

public class LugarTuristico {
    private String Nombre;
    private String Descripcion;
    private String Historia;

    public LugarTuristico(String nombre, String descripcion, String historia) {
        Nombre = nombre;
        Descripcion = descripcion;
        Historia = historia;
    }

    public String getHistoria() {
        return Historia;
    }

    public void setHistoria(String historia) {
        Historia = historia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
