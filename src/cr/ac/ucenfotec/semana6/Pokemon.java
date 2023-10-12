package cr.ac.ucenfotec.semana6;

public abstract class Pokemon {

    protected String nombre;
    protected int vitalidad;
    protected int nivel;

    public Pokemon(String nombre, int vitalidad, int nivel){
        this.nombre = nombre;
        this.vitalidad = vitalidad;
        this.nivel = nivel;
    }
    abstract void atacar();
    abstract void comer();
    public String morir(){
        return "Me muero (léase con voz de worms)";
    };
    public String dormir(){
        this.vitalidad += 10;
        return "El Pokémon ha descansado.";
    };
    public String jugar(){
        return "El Pokémon juega con una pelota. Se ve feliz";
    };
}
