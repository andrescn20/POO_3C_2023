package cr.ac.ucenfotec.semana4;

public class Fabrica {

    public static void main(String[] args) {
        Volante volanteDeportivo = new Volante();
        Carro primerCarro = new Carro(
                volanteDeportivo,
                1234,
                "2300cc",
                "Toyota",
                "V8",
                "200hp",
                "Gasolina"
        );

    }
}
