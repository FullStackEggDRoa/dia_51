/*
    Oejercicio Extra 1
    * Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
    fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
    fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
    */
package ejercicio_otros_extras_1;

import ejercicio_otros_extras_1.Entidades.fraccion;
import ejercicio_otros_extras_1.Servicios.fraccionServicios;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_Otros_Extras_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        fraccionServicios fS = new fraccionServicios();
        fraccion f1 = fS.creaFraccion();
        
        int menu=0;
        
        do {
            System.out.println(".::  MENU FRACCIONES ::.");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            if(menu>4 && menu<0){
                    System.out.print("Opción de Menu Errada. Intentelo nuevamente: ");
            }else{
                    System.out.print("Elija la opción: ");
            }
            do {                
                menu = leer.nextInt();
                
            } while (menu >4 && menu <0);
            
            fraccion fR=new fraccion();
            
            switch (menu) {
                case 1:
                    fR = fS.suma(f1);
                    System.out.println(fR.toString()); 
                    
                    break;
                case 2:
                    fR = fS.resta(f1);
                    System.out.println(fR.toString()); 
                    break;
                case 3:
                    fR = fS.multiplica(f1);
                    System.out.println(fR.toString()); 
                    break;
                case 4:
                    fR = fS.divide(f1);
                    System.out.println(fR.toString()); 
                    break;
                    
                default:
                    System.out.println("Saliendo .... ");;
            }
            
        } while (menu!=0);
        
        //System.out.println(mcd(180,324));
        //System.out.println(mcm(180,324));
    }
    
    /*static int mcd(int d1, int d2){
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
    
    static int mcm(int d1,int d2){
        
        int max = Math.max(d1, d2); // a
        int min = Math.min(d1, d2); // b
        
        return (max / mcd(d1,d2))*min;
        
    }*/
    
    
    
}
