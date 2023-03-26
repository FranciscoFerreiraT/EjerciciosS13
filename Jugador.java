public class Jugador extends Entidad {
    

        
        private int experiencia;

        private int nivel;
    
      
        public Jugador(){
    
        }
    
       
        public Jugador(String nombre, int vida, int ataque, int defensa, int experiencia, int nivel){
            super(nombre, vida, ataque, defensa);

            this.experiencia=experiencia;

            this.nivel=nivel;
        }
    
     
    
        @Override
        public int turno(int accion){
    
            switch (accion){
                case 0:
                    accion=nivel+getAtaque();
                    break;
                case 1:
                    accion=experiencia+getDefensa();
                    break;
                case 2:
                    accion=nivel+experiencia;
                    break;
                default:
                    System.out.println("Error introduce 0,1,2");
            }
    
            return accion;
        }
    
    }

