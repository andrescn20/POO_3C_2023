package cr.ac.ucenfotec.semana5;

public class Funcionario extends Persona{
    private int salario;
    private String puesto;

//    public Funcionario(){
//        super();
//    }
    public Funcionario(int salario, String puesto,
                       String nombre, int edad, String cedula) {
        super(nombre, edad, cedula);
        this.salario = salario;
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
