/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamodulo2;

/**
 *
 
 */
public class Tareamodulo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instanciar la clase recursos
        recursos recu=new recursos();
        //llamada de los metodos
        recu.mensaje();
        recu.nota(70);
        recu.divi(6, 3);
        recu.lista(4);
    }
    //crear la clase recursos
    public static class recursos{
        //crear el metodo mensaje
    public void mensaje(){
         System.out.println("Estoy aprendiendo, pero sere el mejor programador del mundo");
      }
    //crear el metodo nota
    public void nota(int a){
        if (a>=70){
        System.out.println("Alumno aprobado");
        }
        else{
            System.out.println("Alumno reprobado");
        }
            
    }
    //crear el metodo division
    public void divi(double a,double b){
        double c=a/b;
        System.out.println("La division es: "+c);
    }
    //crear el metodo lista
    public void lista(int a){
        for(int x=0;x<=a;x++){
            System.out.println(x);
        }
    }
    }
    
}
