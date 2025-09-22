import java.util.Scanner;

public class Sala {
     Scanner sc = new Scanner(System.in);
        String sala= sc.nextLine();

        // 10x4x1

        String tamaño_sala[]= sala.split("x");
        int filas = Integer.parseInt(tamaño_sala[0]);
        int columnas = Integer.parseInt(tamaño_sala[1]);
        int pasillo = Integer.parseInt(tamaño_sala[2]);
    
}
