/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelafootball;

public class Jugador {

    Jugador[] jugador;
    int tamaño;
    int id;
    String nombre;
    int edad;
    String categoria;

    public Jugador() {
        id = 0;
        nombre = "";
        edad = 0;
        categoria = "";
    }

    public Jugador[] getJugador() {
        return jugador;
    }

    public void setJugador(Jugador[] jugador) {
        this.jugador = jugador;
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

    public void crearVector() {
        jugador = new Jugador[getTamaño()];
    }

    public String mostrarVector() {
        String lis = "";
        for (int i = 0; i < getTamaño(); i++) {
            lis = "Los datos del vectro son" + jugador[i];

        }
        return lis;
    }

}
