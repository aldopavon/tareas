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
public class Formas {
    //atributos
private String Dibujar;
private String Color;

//constractor sin parametros
public Formas(){
    
}
/////////
public void setDibujar(String dibujar){
    this.Dibujar=dibujar;
}
public String getDibujar(){
    return this.Dibujar;
}
///////////
public void setColor(String color){
    this.Color=color;
}
public String getColor(){
    return this.Color;
}

public void imprimirFormas(){
    System.out.println("Figura: "+Dibujar);
    System.out.println("Color:" +Color);
    
}
}
