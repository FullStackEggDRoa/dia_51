/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_otros_extras_1.Entidades;

/**
 *
 * @author droa
 */
public class fraccion {
    // Atributos
    private int denominador;
    private int numerador;
    
    // Constructor

    public fraccion() {
    }

    public fraccion(int denominador, int numerador) {
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    @Override
    public String toString() {
        return "fraccion{" + "denominador=" + denominador + ", numerador=" + numerador + '}';
        //return numerador + "/" + denominador;
    }
    
    
    
}
