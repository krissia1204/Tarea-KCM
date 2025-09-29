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


   public Persona(String UnNombre, int laEdad, int LaFila, int laColumna, String eHuele_a, String eTiene, String eal_lado, String eOdia_Olor){
        this.nombre= UnNombre;
        this.edad=laEdad;
        this.fila=LaFila;
        this.columna=laColumna;
        this.huele_a= eHuele_a;
        this.tiene= eTiene;
        this.al_lado= eal_lado;
        this.odia_olor= eOdia_Olor;

   }

   public String getNombre(){

    return nombre;
   }


    public int getEdad(){

    return edad;
   }

    public int getFila(){

    return fila;
   }

    public int getColumna(){

    return columna;
   }

    public String getHueleA(){

    return huele_a;
   }

    public String getTiene(){

    return tiene;
   }

    public String getAlLado(){

    return al_lado;
   }

    public String getOdiaOlor(){

    return odia_olor;
   }









}