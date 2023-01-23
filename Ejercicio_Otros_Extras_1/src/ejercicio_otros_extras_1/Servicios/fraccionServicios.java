/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_otros_extras_1.Servicios;

import ejercicio_otros_extras_1.Entidades.fraccion;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class fraccionServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public fraccion creaFraccion (){
        System.out.print("Ingrese el valor del Numerador: ");
        int numerador = leer.nextInt();
        System.out.print("Ingrese el valor del Denominador: ");
        int denominador = leer.nextInt();
        return new fraccion(denominador,numerador);
        
    }
    
    public fraccion suma(fraccion fr){
        
        int numerador_total;
        int denominador_total;
              
        System.out.println("Ingrese fracción a Sumar: ");
        System.out.print("Ingrese el valor del Numerador: ");        
        int numerador = leer.nextInt();
        System.out.print("Ingrese el valor del Denominador: ");
        int denominador = leer.nextInt();
        if(denominador == fr.getDenominador())
        {            
            numerador_total=numerador+fr.getNumerador();
            denominador_total=denominador; // Tambien puede ser el Numerador
        }else{
            
            int numerador_factor_1=mcm(denominador,fr.getDenominador())/denominador;
            int numerador_factor_2=mcm(denominador,fr.getDenominador())/fr.getDenominador();
            numerador_total=numerador*numerador_factor_1+fr.getNumerador()*numerador_factor_2;
            denominador_total=mcm(denominador,fr.getDenominador());
        }
        
        return new fraccion(denominador_total,numerador_total);
    }
    public fraccion resta(fraccion fr){
        
        int numerador_total;
        int denominador_total;
              
        System.out.println("Ingrese fracción a Restar: ");
        System.out.print("Ingrese el valor del Numerador: ");        
        int numerador = leer.nextInt();
        System.out.print("Ingrese el valor del Denominador: ");
        int denominador = leer.nextInt();
        if(denominador == fr.getDenominador())
        {            
            numerador_total=numerador+fr.getNumerador();
            denominador_total=denominador; // Tambien puede ser el Numerador
        }else{
            
            int numerador_factor_1=mcm(denominador,fr.getDenominador())/denominador;
            int numerador_factor_2=mcm(denominador,fr.getDenominador())/fr.getDenominador();
            numerador_total=numerador*numerador_factor_1-fr.getNumerador()*numerador_factor_2;
            denominador_total=mcm(denominador,fr.getDenominador());
        }
        
        return new fraccion(denominador_total,numerador_total);
    }
    
    public fraccion multiplica(fraccion fr){
        
        int numerador_total;
        int denominador_total;
              
        System.out.println("Ingrese fracción a Multiplicar: ");
        System.out.print("Ingrese el valor del Numerador: ");        
        int numerador = leer.nextInt();
        System.out.print("Ingrese el valor del Denominador: ");
        int denominador = leer.nextInt();
        
        numerador_total=numerador*fr.getNumerador();
        denominador_total=denominador*fr.getDenominador(); // Tambien puede ser el Numerador
        
        return new fraccion(denominador_total,numerador_total);
    }
    
    public fraccion divide(fraccion fr){
        
        int numerador_total;
        int denominador_total;
              
        System.out.println("Ingrese fracción a Multiplicar: ");
        System.out.print("Ingrese el valor del Numerador: ");        
        int numerador = leer.nextInt();
        System.out.print("Ingres el valor del Denominador: ");
        int denominador = leer.nextInt();
        
        numerador_total=numerador*fr.getDenominador();
        denominador_total=denominador*fr.getNumerador();
        
        return new fraccion(denominador_total,numerador_total);
    }
    
    public int mcd(int d1, int d2){
        int max = Math.max(d1, d2); // a
        int min = Math.min(d1, d2); // b
        
        int resultado = 0;
        
        do {
            resultado = min;
            min = max % min;
            max = resultado;            
        } while (min!=0);
        return resultado;
    }
    
    public int mcm(int d1,int d2){
        
        int max = Math.max(d1, d2); // a
        int min = Math.min(d1, d2); // b
        
        return (max / mcd(d1,d2))*min;
        
    }
    
}
