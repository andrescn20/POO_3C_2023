package cr.ac.ucenfotec.semana5;

public class Empresa {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona = new Funcionario(1000, "Gerente", "Mariela", 22, "123456789");
        Funcionario funcionario = new Funcionario(1000, "Gerente", "Juan", 25, "123456789");
        System.out.println("Nombre: " + funcionario.getNombre());
        System.out.println("Edad: " + funcionario.getEdad());
        System.out.println("Cédula: " + funcionario.getCedula());
        System.out.println("Salario: " + funcionario.getSalario());
        System.out.println("Puesto: " + funcionario.getPuesto());
        
    }
}
