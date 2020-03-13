/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamodulo3;

/**
 *
 
 */
public class Tareamodulo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear la instancia de la clase Estudiante
        Estudiante estudiante=new Estudiante();
        
        estudiante.setnombre("Aldo");
        estudiante.setapellido("Pavon");
        estudiante.setedad(20);
        estudiante.setdireccion("Choloma");
        estudiante.setsexo("Masculino");
        estudiante.setcarrera("Ing. Industrial");
        
        System.out.println("Nombre: "+estudiante.getnombre());
        System.out.println("Apellido: "+estudiante.getapellido());
        System.out.println("Edad: "+estudiante.getedad());
        System.out.println("Sexo: "+estudiante.getsexo());
        System.out.println("Direccion: "+estudiante.getdireccion());
        System.out.println("Carrera: "+estudiante.getcarrera());
    }
    public static class Estudiante{
        //private hace que los atributos sean accedidos dentro de la clase
        private String nombre;
        private String apellido;
        private int edad;
        private String sexo;
        private String direccion;
        private String carrera;
        
        //metodos publicos para obtener a los datos
        
        public String getnombre(){
            return nombre;
        }
        public String getapellido(){
            return apellido;
        }
        public int getedad(){
            return edad;
        }
        public String getsexo(){
            return sexo;
        }
        public String getdireccion(){
            return direccion;
        }
        public String getcarrera(){
            return carrera;
        }
        
        //metodos publicos para establecer los datos
        public void setnombre(String nombr){
            this.nombre=nombr;
        }
        public void setapellido(String apellid){
            this.apellido=apellid;
        }
        public void setedad(int eda){
            this.edad=eda;
        }
        public void setsexo(String sex){
            this.sexo=sex;
        }
        public void setdireccion(String direccio){
            this.direccion=direccio;
        }
        public void setcarrera(String carrer){
            this.carrera=carrer;
        }
    }
    
}
