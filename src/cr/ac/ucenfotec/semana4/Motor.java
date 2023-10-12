package cr.ac.ucenfotec.semana4;

public class Motor {
    private int noSerie;
    private String cilindraje;
    private String marca;
    private String tipoMotor;
    private String potencia;
    private String combustible;

    public Motor(int noSerie,
                 String cilindraje,
                 String marca,
                 String tipoMotor,
                 String potencia,
                 String combustible) {
        this.noSerie = noSerie;
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.tipoMotor = tipoMotor;
        this.potencia = potencia;
        this.combustible = combustible;
    }

}
