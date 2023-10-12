//Definición del paquete al que pertenece
package cr.ac.ucenfotec.semana3;



//Clase curso que utilizamos para corerr el ejemplo.
public class Curso {
    public static void main(String[] args) {
        Estudiante alumno1 = new Estudiante("Juan", 21, "123123-123123");
        Estudiante alumno2 = new Estudiante();
        Estudiante alumno3 = new Estudiante("Matias");
        System.out.println(alumno1.nombre+ " " + alumno1.edad + alumno1.cedula);
        System.out.println(alumno2.toString());



    }
}
