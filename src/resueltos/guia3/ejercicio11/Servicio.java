package resueltos.guia3.ejercicio11;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Servicio implements Facturable {

    private int cantHoras;

    public abstract double getValorHora();

    public double getPrecio() {
        return cantHoras * getValorHora();
    }

    @Override
    public double getMontoFacturacion() {
        return Matematica.sumarPorcentaje(getPrecio(), IVA / 2.0);
    }

}