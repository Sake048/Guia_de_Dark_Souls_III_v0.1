package com.ks.guiadedarksoulsiii;

public class almas_entrada {

    private String texto;
    private String subTexto;

    public almas_entrada(String texto, String subTexto){
        this.texto=texto;
        this.subTexto=subTexto;
    }

    public String get_texto(){
        return texto;
    }

    public String get_subTexto(){
        return subTexto;
    }
}
