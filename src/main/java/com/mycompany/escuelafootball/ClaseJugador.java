/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelafootball;

public class ClaseJugador {

    Jugador jugador[];
    int tamaño;

    public ClaseJugador() {
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

    public void crearVector() {
        jugador = new Jugador[getTamaño()];

    }

    /*public String mostrarVector(){
        String lis = "";
        for (int i = 0; i < getTamaño(); i++) {
           lis += "Los datos del vector son " + i + " " + this.jugador[i].getNombre();
            
        }
        return lis;
    }*/
    public String mostrarVector() {
        String lis = "";
        for (int i = 0; i < getTamaño(); i++) {
            lis += "Nombre del Jugador: " + this.jugador[i].getNombre() + " Su ID es: " + this.jugador[i].getId()
                    + " Su edad es; " + this.jugador[i].getEdad() + " Su posicion en la que juega es; " + this.jugador[i].getPosicion() + " \n";

        }
        return lis;
    }

    public String buscarId(int BusId) {
        String lis = "";
        for (int i = 0; i < getTamaño(); i++) {
            if (jugador[i].getId() == BusId) {
                lis += "El nombre es; " + this.jugador[i].getNombre() + " Su edad es: " + this.jugador[i].getEdad()
                        + " Juega en la posicion: " + this.jugador[i].getPosicion();
            }
        }
        return lis;

    }

    public String categoria() {
        String lis = "";
        for (int i = 0; i < getTamaño(); i++) {
            if (jugador[i].getEdad() >= 9 && jugador[i].getEdad() <= 12) {
                lis += "Categoria Infatil"
                        + "Nombre: " + jugador[i].getNombre() + " Edad: " + jugador[i].getEdad() + " Posicion: " + jugador[i].getPosicion() + "\n";

            } else if (jugador[i].getEdad() >= 13 && jugador[i].getEdad() <= 15) {
                lis += "Categoria Junior "
                        + " Nombre: " + jugador[i].getNombre() + " Edad: " + jugador[i].getEdad() + " Posicion: " + jugador[i].getPosicion();

            }

        }

        return lis;

    }

}
