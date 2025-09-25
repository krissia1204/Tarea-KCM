import java.util.Scanner;

public class Sala {

        private String sala;
        private int filas;
        private int columnas;
        private int pasillo;
        String  sala_de_cine [][];


     

        // 10x4x1
        public Sala (String sala) {
       
       
                 String tamaño_sala[]= sala.split("x");
                 this.filas = Integer.parseInt(tamaño_sala[0]);
                 this.columnas = Integer.parseInt(tamaño_sala[1]);
                 this.pasillo = Integer.parseInt(tamaño_sala[2]);
                 sala_de_cine = new String[][];
        }

}
    

