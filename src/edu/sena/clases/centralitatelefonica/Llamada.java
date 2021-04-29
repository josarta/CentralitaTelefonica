/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.clases.centralitatelefonica;

/**
 *
 * @author Josarta
 */
public class Llamada {

    private String tipo;
    private long numeroOrigen;
    private long numeroDestino;
    private int duracion;
    private Franja franja;

    public Llamada() {
    }

    public Llamada(String tipo, long numeroOrigen, long numeroDestino, int duracion, Franja franja) {
        this.tipo = tipo;
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.duracion = duracion;
        this.franja = franja;
    }

    
    public Llamada(String tipo, long numeroOrigen, long numeroDestino, int duracion) {
        this.tipo = tipo;
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.duracion = duracion;
    }
    
    public double valorLlamada() {
        if (this.tipo.equalsIgnoreCase("fijo")) {
            return 200 * this.duracion;
        } else {
            return this.duracion * this.franja.getValor();
        }
    }

    public Franja getFranja() {
        return franja;
    }

    public void setFranja(Franja franja) {
        this.franja = franja;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(long numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public long getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(long numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}
