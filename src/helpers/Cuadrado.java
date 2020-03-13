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
public class Cuadrado extends Formas{
    public Double Area;
    public Cuadrado(){
        setDibujar("Esta figura es un cuadrado");
        setColor("Esta figura es de color negro");
    }
    public void setArea(double s){
        Area=s*s;
        this.Area=Area;
    }
    public double getArea(){
        return this.Area;
    }
    
}
