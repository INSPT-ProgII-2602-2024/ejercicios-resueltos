package resueltos.guia3.ejercicio5;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class ArchivoMultimedia extends Archivo {

    private int duracion;
    private boolean reproduciendo;

    public ArchivoMultimedia(int duracion, String nombre, double peso, String localizacion) {
        super(nombre, peso, localizacion);
        this.duracion = duracion;
        this.reproduciendo = false;
    }    

    public void reproducir() {
        this.reproduciendo = true;
    }

    public void parar() {
       this.reproduciendo = false;
    }

}