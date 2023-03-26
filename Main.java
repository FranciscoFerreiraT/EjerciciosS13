import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner memoria = new Scanner(System.in);

       

        Jugador Kaladin = new Jugador("Kaladin",100,10,8,30,10);

        Enemigo Amaran = new Enemigo("Amaran",1000,8,5,10);

      

        Entidad cadena [] = new Entidad[2];

     cadena[0]= Kaladin;
cadena[1]= Amaran;

     

       for(int i=0; i< cadena.length;i++){
            System.out.println("Num objeto: "+i);

            System.out.println("Nombre :" + cadena[i].getNombre());

            System.out.println("vida: "+ cadena[i].getVida());

            System.out.println("ataque: " + cadena[i].getAtaque());

            System.out.println("defensa: " + cadena[i].getDefensa());

            System.out.println("El ataque inflinge: " + cadena[i].turno(2)+" de daño ");

            System.out.println(":v");
        }


    }
}