package resueltos.guia3.ejercicio5;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Archivo {

    private String nombre;
    private double peso;
    private String localizacion;
    private boolean abierto;

    public Archivo(String nombre, double peso, String localizacion) {
        // Faltan las validaciones
        this.nombre = nombre;
        this.peso = peso;
        this.localizacion = localizacion;
        this.abierto = false;
    }      

    public void abrir() {
        this.abierto = true;
    }

    public void cerrar() {
        if (abierto) {
            this.abierto = false;            
        }
    }

    public boolean mover(String string1) {
        // Método a resolver...
        return false;
    }

}