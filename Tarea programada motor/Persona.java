import java.io.BufferedReader;
import java.io.File; //Para encontrar un archivo 
import java.io.FileNotFoundException; //Por si no encuentra el archivo con ese nombre
import java.io.FileReader;
import java.io.IOException;

public class Persona { //inicio clase Persona

// Campos/atributos
   private String nombre;
   private int edad;
   private int fila;
   private int columna;
   private String huele_a;
   private String tiene;
   private String al_lado;
   private String odia_olor;
   private String[] npersonas;
   private String[] valores;
   //File myObj = new File("reglas.csv"); como comentario pq se lee abajo, creo que no se necesita

//Constructor
    public Persona() {
    }

    // Método que recibe el nombre del archivo y lo lee línea por línea
    public static void LeerPersona(String nombreArchivo) 
    {
        BufferedReader br = null;
        try 
        {
            br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            int contador= 0;
            while ((linea = br.readLine()) != null) 
            {
                contador++;
            }
            //try para guardar personas en array
            try 
    
            {
                String [] npersonas= new String[contador];
                int i= 0;
                br = new BufferedReader(new FileReader(nombreArchivo));
                while ((linea = br.readLine()) != null) 
                {
                    npersonas[i]= linea;
                    i++;
                    
                }}

             catch (IOException e) 
             {
            System.out.println("Error al leer el archivo: " + e.getMessage());
                } 

            } 
            
        catch(FileNotFoundException e) 
        {
            System.out.println("Archivo no encontrado: " + e.getMessage());            
        } 
        catch (IOException e) 
        {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } 
        finally 
        {
            // Cerrar el BufferedReader si se abrió
            if (br != null) 
            {
                try 
                {
                    br.close();
                } 
                catch (IOException e) 
                {
                    System.out.println("Error al cerrar el archivo: " + e.getMessage());
                }
            }
        }
         
}

    //metodo para separar los valores de cada persona (linea) por comas
    public void setPersona(){

        for (int i=0; i<=npersonas.length; i++){

            valores = npersonas[i].split(",");

            System.out.println(valores);
        }

    }

}