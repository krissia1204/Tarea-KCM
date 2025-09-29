public class Sala {
        private int filas;
        private int columnas;
        private int pasillo;
        private String[][] sala_de_cine;
        private String archivoReglas;
        private String archivoDistribucion;
        
        //Constructor vacío
        public Sala () { 
                
        }
         //Método que recibe los argumentos y los guarda
        public void setAcomodadorDeSala(String[] sala) {
                 //Recibe los argumentos y los guarda
                if (sala.length < 3) {
                        throw new IllegalArgumentException("Uso: java -jar motor.jar <NxMxP> <archivoReglas> <archivoDistribucion>");
                }

                 String[] tamaño_sala= sala[0].split("x");
                 if (tamaño_sala.length != 3) {
                        throw new IllegalArgumentException("Formato incorrecto en dimensiones. Debe ser NxMxP (ej: 5x9x1)");
                 }

                 this.filas = Integer.parseInt(tamaño_sala[0]);
                 this.columnas = Integer.parseInt(tamaño_sala[1]);
                 this.pasillo = Integer.parseInt(tamaño_sala[2]);

                //Guardar los nombres de archivo
                this.archivoReglas = sala[1];
                this.archivoDistribucion = sala[2];

                this.sala_de_cine = new String[this.filas][this.columnas];

                //Indicar el pasillo (en medio de las columnas)
                if (this.pasillo == 1) {
                       sala_de_cine[this.filas][this.columnas / 2] = null;
                } else if (this.pasillo == 2) {
                       sala_de_cine[this.filas][this.columnas / 3] = null;
                       sala_de_cine[this.filas][2*(this.columnas / 3)] = null; 
                } else {
                System.out.println("No pueden haber más de dos pasillos.");

                }
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

} //Final de clase Sala