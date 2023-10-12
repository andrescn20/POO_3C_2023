public class Cajero {
    private String nombre;
    private int edad;
    private double tarifaHoraria;
    private boolean estaTrabajando;

    public Cajero() {
        this.nombre = "Cajero";
        this.edad = 20;
        this.tarifaHoraria = 4000.0;
        this.estaTrabajando = true;
    }

    public Cajero(String nombre, int edad, double tarifaHoraria, boolean estaTrabajando){
      this.nombre = nombre;
      this.edad = edad;
      this.tarifaHoraria = tarifaHoraria;
      this.estaTrabajando = estaTrabajando;

    }

    public void sayName() {
        System.out.println("Mi nombre es " + this.nombre);
    }

    private String sayName(String nombre){
        return "Mi otro nombre es " + nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double calcularSalario(int horasTrabajadas) {
        return this.tarifaHoraria * horasTrabajadas;
    }
}
