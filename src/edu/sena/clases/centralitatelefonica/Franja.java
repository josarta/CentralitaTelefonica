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
public class Franja {
    private String nombre;
    private double valor;
    private String horaInicio; 
    private String horaFin;
    
    public Franja(){
    }
    
    public Franja(String nombre , double  valor , String horaInicio, String horaFin){
        this.nombre = nombre;
        this.valor = valor;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    
    
    
    
    
    
    
    
    
    
}
