public class Persona {

    // Identificación básica
    private String nombre;
    private int edad; // < 18 niño, >= 18 adulto (según enunciado)

    // Preferencias (tal como vienen en el archivo de reglas)
    // Ejemplos: fila: "primera", "2", "!2"; columna: "central", "!central", "pasillo", "!pasillo", "1", "2", ...
    private String filaPreferencia;     // puede ser null si no está en reglas
    private String columnaPreferencia;  // puede ser null si no está en reglas

    // Características/atributos
    private String huele_a;    // Ej: "sucio", "perfume" (puede ser null)
    private String tiene;      // Ej: "palomitas", "sombrero", "hablada", "celular_encendido" (puede contener varios separados por "," si aparecen múltiples)
    private String al_lado;    // Regla al lado. Puede contener varias condiciones separadas por "," (p.e.: "nombre:Luisa,adulto,nadie")
    private String odia_olor;  // Ej: "sucio", "perfume", "todos" (si varias, separadas por ",")

    // Ubicación real asignada en la sala según archivo de juego (1-based)
    private int filaAsignada = -1;
    private int columnaAsignada = -1;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters básicos
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Preferencias
    public String getFilaPreferencia() {
        return filaPreferencia;
    }

    public void setFilaPreferencia(String filaPreferencia) {
        this.filaPreferencia = filaPreferencia;
    }

    public String getColumnaPreferencia() {
        return columnaPreferencia;
    }

    public void setColumnaPreferencia(String columnaPreferencia) {
        this.columnaPreferencia = columnaPreferencia;
    }

    // Características
    public String getHueleA() {
        return huele_a;
    }

    public void setHueleA(String huele_a) {
        this.huele_a = huele_a;
    }

    public String getTiene() {
        return tiene;
    }

    public void setTiene(String tiene) {
        this.tiene = tiene;
    }

    public String getAlLado() {
        return al_lado;
    }

    public void setAlLado(String al_lado) {
        this.al_lado = al_lado;
    }

    public String getOdiaOlor() {
        return odia_olor;
    }

    public void setOdiaOlor(String odia_olor) {
        this.odia_olor = odia_olor;
    }

    // Ubicación asignada
    public void setUbicacion(int fila, int columna) {
        this.filaAsignada = fila;
        this.columnaAsignada = columna;
    }

    public int getFilaAsignada() {
        return filaAsignada;
    }

    public int getColumnaAsignada() {
        return columnaAsignada;
    }

    public boolean estaUbicada() {
        return filaAsignada > 0 && columnaAsignada > 0;
    }
}
