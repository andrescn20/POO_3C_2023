package cr.ac.ucenfotec.semana4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Carro {
    //Al definir atributos que son instancias de otras clases, estoy generando asociacion
    private Motor motor;
    private Volante volante;

    public Carro(
            Volante volante,
            int noSerie,
            String cilindraje,
            String marca,
            String tipoMotor,
            String potencia,
            String combustible
    ){
        this.motor = new Motor(noSerie,
                cilindraje,
                marca,
                tipoMotor,
                potencia,
                combustible
        );//Composicion
        this.volante = volante;//Agregacion
    }
}
