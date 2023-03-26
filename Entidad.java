import java.util.Scanner;

public class Entidad {

    private int vida;

    private int ataque;

    private int defensa;

    private String nombre;


    public Entidad() {

    }


    public Entidad(String nombre, int vida, int ataque, int defensa){
        this.nombre=nombre;

        this.vida=vida;

        this.ataque=ataque;

        this.defensa=defensa;
    }

  

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int turno(int accion){
        return accion;

    }

    public void info(){

    }
}