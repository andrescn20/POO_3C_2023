//Esta línea define a que paquete pertenece la clase
package cr.ac.ucenfotec.semana3;

//Definición de la clase Estudiante
public class Estudiante {
     //Se definen los atributos no inicializados.
     String nombre;
     int edad;
     String cedula;
//Importante, los atributos en este caso no tienen modificadores de acceso.
//Recuerde que deberían definirse todos con el modificador más adecuado (usualmente private)

     //Constructor por defecto (sin atributos)
     public Estudiante(){
          //Aca podemos inicializar los atributos con valores por defecto.
          this.nombre = "Nombre Generico";
          this.edad = 25;
          this.cedula = "No Identificado";
     }

     //A continuación se presentan varios constructores con diferentes parámetros.
     //A esto le llamamos "sobrecarga de métodos". Nos permite elegir el método
     //que prefiramos dependiendo de los parámetros que le pasemos.
     public Estudiante(String nombre){
          this.nombre = nombre;
          this.edad = 25;
          this.cedula = "No identificado";
     }

     public Estudiante(String nombre, int edad, String cedula){
          this.nombre = nombre;
          this.edad = edad;
          this.cedula = cedula;
     }

     //Nótese que cambiar el orden de los parámetros también es válido.
     public Estudiante( int edad, String cedula, String nombre){
          this.nombre = nombre;
          this.edad = edad;
          this.cedula = cedula;
     }

     //Este es el método que se utiliza para "imprimir" la información del objeto.
     public String toString(){
          return "Nombre: " + this.nombre + " Edad: " + this.edad + " Cedula: " + this.cedula;
     }
}
