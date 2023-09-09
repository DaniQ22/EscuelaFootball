/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelafootball;


public class ClaseJugador {
    Jugador jugador[];
    int tamaño;
    
    public ClaseJugador(){
        jugador = null;
        tamaño = 0;
    }

    public Jugador[] getJugador() {
        return jugador;
    }

    public void setJugador(int pos, Jugador player) {
        this.jugador[pos] = player;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    public void crearVector(){
        jugador = new Jugador[getTamaño()];
        
    }
    
    public String mostrarVector(){
        String lis = "";
        for (int i = 0; i < getTamaño(); i++) {
           lis = "Los datos del vector son " + i + " " + jugador[i].getNombre();
            
        }
        return lis;
    }
    
}
