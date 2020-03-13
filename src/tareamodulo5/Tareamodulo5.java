/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamodulo5;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Lineas;
import helpers.Triangulo;

/**
 *
 * 
 */
public class Tareamodulo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //circulo
        Circulo circulo=new Circulo();
        circulo.imprimirFormas();
        circulo.establecerRadio(5);
        System.out.println("El radio del circulo es: "+circulo.obtenerRadio());
        
        /////Linea
        System.out.println("\n");
        Lineas lineas=new Lineas();
        lineas.imprimirFormas();
        
        ///Triangulo
        System.out.println("\n");
        Triangulo triangulo=new Triangulo();
        triangulo.imprimirFormas();
        triangulo.setAreat(10, 5);
        System.out.println("El area del triangulo es: "+triangulo.getArea());
        
        //Cuadrado
        System.out.println("\n");
        Cuadrado cuadrado=new Cuadrado();
        cuadrado.imprimirFormas();
        cuadrado.setArea(6);
        System.out.println("El area del cuadrado es: "+cuadrado.getArea());
        
        
        
        
    }
    
}
