package cr.ac.ucenfotec.semana6;
public class Main {
    public static void main(String[] args) {
        Fuego magmar = new Fuego("Magmar", 100, 52, 750);
        String magmarString = magmar.toString();
        System.out.println(magmarString);
        magmar.atacar();
        magmarString = magmar.toString();
        System.out.println(magmarString);
        magmar.comer();
        magmar.dormir();
        magmarString = magmar.toString();
        System.out.println(magmarString);

    }
}
