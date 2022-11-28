package com.ks.guiadedarksoulsiii;

public class ModeloHechizos {

    private String nombre;
    private String obtencion;
    private String espacios;
    private String inteligenciaNece;
    private String costePC;
    private int image;


    public ModeloHechizos(String nombre, String obtencion, String espacios, String inteligenciaNece, String costePC, int image) {
        this.nombre = nombre;
        this.obtencion = obtencion;
        this.espacios = espacios;
        this.inteligenciaNece = inteligenciaNece;
        this.costePC = costePC;
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObtencion() {
        return obtencion;
    }

    public void setObtencion(String obtencion) {
        this.obtencion = obtencion;
    }

    public String getEspacios() {
        return espacios;
    }

    public void setEspacios(String espacios) {
        this.espacios = espacios;
    }

    public String getInteligenciaNece() {
        return inteligenciaNece;
    }

    public void setInteligenciaNece(String inteligenciaNece) {
        this.inteligenciaNece = inteligenciaNece;
    }

    public String getCostePC() {
        return costePC;
    }

    public void setCostePC(String costePC) {
        this.costePC = costePC;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
