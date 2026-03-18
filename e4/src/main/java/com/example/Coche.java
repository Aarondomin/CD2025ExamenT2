package com.example;

public class Coche {

    //*Marca del coche */
    private String marca;
    /**Modelo del coche */
    private String modelo;
    /**Velocidad del coche */
    private int velocidad;


    /**
     * Constructor para crear un nuevo coche
     * @param marca marca del coche
     * @param modelo modelo del coche
     */
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    /**
     * Incrementa la velocidad del coche
     * @param incremento velocidad que se incrementa
     */
    
    public void acelerar(int incremento) {
        velocidad += incremento; 
    }

    /**
     * Disminuye la velocidad del coche y no puede bajar de 0
     * @param decremento velocidad que se disminuye
     */
    public void frenar(int decremento) {
        velocidad -= decremento;
        if (velocidad < 0) {
            velocidad = 0;
        }
    }

    /**
     * Obtine la velocidad
     * @return devuelve la velocidad del coche
     */
    public int getVelocidad() {
        return velocidad;
    }
}