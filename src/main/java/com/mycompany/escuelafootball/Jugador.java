/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelafootball;

/**
 *
 * @author Usuario
 */
public class Jugador {
    String Vector[];
    int tamaño;
    int id;
    String nombre;
    int edad;
    String categoria;
    
    public Jugador(){
        Vector = null;
        tamaño = 0;
        id = 0;
        nombre = "";
        edad = 0;
        categoria = "";        
    }

    public String[] getVector() {
        return Vector;
    }

    public void setVector(String[] Vector) {
        this.Vector = Vector;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    
}
