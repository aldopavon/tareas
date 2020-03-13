/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * 
 */
public class Circulo extends Formas {
     private double Radio;
public Circulo(){
   
    setDibujar("Este es un circulo");
    setColor("Esta figura es de color rojo");
}
//metodo para calcular area circulo
public void establecerRadio(double radio){
     radio=(radio*3.14)/2;
    this.Radio=radio;
}
public double obtenerRadio(){
    return this.Radio;
}
    
    
}
