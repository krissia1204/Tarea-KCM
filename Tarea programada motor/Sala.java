     public class Sala {
        private int filas;
        private int columnas;
        private int pasillo;
        private char [][] asientos;
        
        //Constructor vacío
        public Sala () { 
                
        }
         //Método que recibe los argumentos y los guarda
        public void setAcomodadorDeSala(String config) {

                String [] sala= config.split("x");

                if (sala.length>2){

                        System.out.println("Formato incorrecto, la dimesion de la sala no se puede completar.Por fabor ingrese un formato AxBx[C]");

                }

                else if (sala.length==1){

                        filas=Integer.parseInt(sala[0]);
                        columnas=Integer.parseInt(sala[1]);
                        pasillo=0;
                }

                else {

                        filas=Integer.parseInt(sala[0]);
                        columnas=Integer.parseInt(sala[1]);
                        pasillo=Integer.parseInt(sala[2]);

                }

                for (int i= 0; i<filas; i++){
                        for (int j= 0; j<columnas; j++){

                                if(esPasillo(j)){

                                        asientos[i][j]='|';

                                }

                                else {
                                        asientos[i][j]='0';

                                }


                        }

                }
              
                

                }


                private boolean esPasillo(int columna){
                      
                        if (pasillo==0) return false;
                        int bloque= columnas/(pasillo+1);
                        for(int k=1; k<=pasillo;k++){

                                int columnaPasillo= k*bloque;
                                if (columna==columnaPasillo-1) return true;
                        }
                        return false;

                }
        
        //Métodos get por si es necesario
        //Borrar en caso de no ser necesario
        public int getFilas() {
                return filas;
        }

        public int getColumnas() {
                return columnas;
        }

        public int getPasillo() {
                return pasillo;
        }

         //Final de clase Sala
}