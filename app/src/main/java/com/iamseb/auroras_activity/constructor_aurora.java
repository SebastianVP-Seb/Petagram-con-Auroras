package com.iamseb.auroras_activity;

public class constructor_aurora {
    private String nombre;
    private String numero;
    private int foto;
    private int estre;
    private int estrella;

    public constructor_aurora(String nombre,String numero,int foto,int estre,int estrella){
        this.nombre=nombre;
        this.numero=numero;
        this.foto=foto;
        this.estre=estre;
        this.estrella=estrella;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getEstre() {
        return estre;
    }

    public void setEstre(int estre) {
        this.estre = estre;
    }

    public int getEstrella() {
        return estrella;
    }

    public void setEstrella(int estrella) {
        this.estrella = estrella;
    }
}
