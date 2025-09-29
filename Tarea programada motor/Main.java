 public static void main(String[] args) 
    {
        // Verifica que se haya pasado el nombre del archivo como argumento
        if (args.length > 0) 
        {
            String nombreArchivo = args[0]; // primer argumento
            // String segundoArgumento = args[1]; // si hubiera mas de un argumento, asi se lee el segundo, y se asigna a otro string
            leerPersona(nombreArchivo);
        } 
        else 
        {
            System.out.println("Por favor, indique el nombre del archivo como argumento.");
        }
    }