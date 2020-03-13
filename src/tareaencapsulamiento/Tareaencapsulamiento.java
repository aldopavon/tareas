/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaencapsulamiento;

import helpers.Ciudadano;


public class Tareaencapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instanciar la clase ciudadano y colocar edad 15
        Ciudadano ciudadano=new Ciudadano(15);
        
        ciudadano.imprimiredad();
        
        //establecer valor a variable privada
        ciudadano.establecernombre("Carlos");
        ciudadano.establecerexperiencia(10);
        
        //mandar a imprimir lo que se obtuvo de nombre y experiencia
        System.out.println(ciudadano.obtenernombre());
        System.out.println(ciudadano.obtenerexperiencia());
    }
    
}
