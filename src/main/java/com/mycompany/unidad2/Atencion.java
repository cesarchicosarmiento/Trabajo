/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad2;

import java.time.LocalDate;

/**
 *
 * @author Usuario R
 */
public class Atencion {
    private LocalDate fecha;
    private String veterinario;
    private double costo;
    private Mascota mascota;
    private Receta[] recetaList;
    
   
    
    
    public Atencion(LocalDate fecha, String veterinario, double costo, Mascota mascota) {
        this.fecha = fecha;
        this.veterinario = veterinario;
        this.costo = costo;
        this.mascota = mascota;
    }

    public void nuevaReceta(String medicamento, int cantidad, String indicacion,int posicion) {
        var receta = new Receta(medicamento, cantidad, indicacion);
        this.recetaList[posicion] = receta;
    }
    
    
    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Atencion{" + "fecha=" + fecha.toString() + ", veterinario=" 
                + veterinario + ", costo=" + costo + ", mascota=" + mascota + '}';
    }
}
