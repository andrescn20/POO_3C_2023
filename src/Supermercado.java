public class Supermercado {

    public static void main(String[] args) {
        Cajero cajero1 = new Cajero();
        Cajero cajero2 = new Cajero("Ariel", 20, 4000.0, true);
        Cajero cajero3 = new Cajero("Jimena", 21, 5000.0, true);
        cajero1.setNombre("Camilo");
        cajero2.setNombre("Juan");
        cajero2.sayName();
//        String decirNombre = cajero2.sayName("Pedro");
//        System.out.println(decirNombre);
        System.out.println(cajero1.getNombre());
        System.out.println(cajero2.getNombre());
        System.out.println(cajero3.getNombre());
        System.out.println(cajero1.calcularSalario(40));

    }
}
