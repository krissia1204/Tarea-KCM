import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class borrador {


    // Método que recibe el nombre del archivo y lo lee línea por línea
    public void setPersona(String nombreArchivo) 
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
                    for (int j=0; j<=npersonas.length; j++){

                        String [] valores= linea.split(",");
                        String [] partes= valores[l].split(":");

                        switch (partes[0]){

                         case "nombre":
                          nombre= partes[1];
                         break;

                         case "edad":
                         edad = partes[1];
                         break;

                         case "fila":
                         fila = partes[1];
                         break;

                         case "columna":
                         columna = partes[1];
                         break;

                         
                         case "huele_a":
                         huele_a = partes[1];
                         break;

                         
                         case "tiene":
                         tiene= partes[1];
                         break;

                         case "al_lado":
                         nombre= partes[1];
                         break;

                         case "odia_olor":
                         nombre= partes[1];
                         break;

                        }


                        

                    
                    }
                }
            }

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
}
    
}
