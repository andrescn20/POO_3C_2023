package cr.ac.ucenfotec.semana6;

public  class Fuego extends Pokemon{
    private int tempraturaLlama;
    public Fuego(String nombre, int vitalidad, int nivel, int temperatura){
        super(nombre, vitalidad, nivel);
        this.tempraturaLlama = temperatura;
    }
    @Override
    public void atacar(){
        super.vitalidad -= 30;
        System.out.println("El Pokemón usó Llamarada. Ha perdido vitalidad por el cansancio");
    };

    @Override
    public void comer(){
        super.vitalidad += 5;
        System.out.println("...procede a rostizar un Magikarp...");
    }

    @Override
    public String toString() {
        return "Fuego{" +
                "tempraturaLlama=" + tempraturaLlama +
                ", nombre='" + nombre + '\'' +
                ", vitalidad=" + vitalidad +
                ", nivel=" + nivel +
                '}';
    }
}
