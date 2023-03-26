
    public class Enemigo extends Entidad {
   
        private int dif;
    
 
        public Enemigo(){
    

        public Enemigo (String nombre, int vida, int ataque, int defensa,int dificultad){

            super(nombre, vida, ataque, defensa);

            this.dif=dificultad;
        }

        
    
    
        @Override
        public int turno(int accion){

            switch (accion){

                case 0:

                    accion=dif+getAtaque();

                    break;

                case 1:

                    accion=dif+getDefensa();

                    break;

                case 2:

                    accion=dif+getAtaque()+getDefensa();

                    break;

                default:

                    System.out.println("Error introduce 1, 2,3");

            }
    
            return accion;
        }
        
    
    
    
    }

