import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorArchivos 
{

    // Método que recibe el nombre del archivo y lo lee línea por línea
    public static void leerArchivo(String nombreArchivo) 
    {
        BufferedReader br = null;
        try 
        {
            br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while ((linea = br.readLine()) != null) 
            {
                System.out.println(linea); // imprime cada línea
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

    public static void main(String[] args) 
    {
        // Verifica que se haya pasado el nombre del archivo como argumento
        if (args.length > 0) 
        {
            String nombreArchivo = args[0]; // primer argumento
            // String segundoArgumento = args[1]; // si hubiera mas de un argumento, asi se lee el segundo, y se asigna a otro string
            leerArchivo(nombreArchivo);
        } 
        else 
        {
            System.out.println("Por favor, indique el nombre del archivo como argumento.");
        }
    }
}
