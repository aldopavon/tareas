/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;


public class Ciudadano {
    private int edad;
    private String nombre;
    private int experiencia;
    
    //constructor
    public Ciudadano(int edad){
        this.edad=edad;
    }
    //encapsulamiento
    public void imprimiredad(){
    System.out.println(edad);
}
    //establecer nombre
    public void establecernombre(String _nombre){
        this.nombre=_nombre;
    }
    //establecer experiencia
    public void establecerexperiencia(int _experiencia){
        this.experiencia=_experiencia;
    }
    //obtener
    public String obtenernombre(){
        return nombre;
    }
    public int obtenerexperiencia(){
        return experiencia;
    }
}
