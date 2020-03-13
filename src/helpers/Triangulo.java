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
public class Triangulo extends Formas{
    private double area;
    public Triangulo(){
        setDibujar("Este es un triangulo");
        setColor("Esta figura es de color azul");
    }
    public void setAreat(double b,double a){
        
        area=(b*a)/2;
        this.area=area;
    }
    public Double getArea(){
        return this.area;
    }
    
}
