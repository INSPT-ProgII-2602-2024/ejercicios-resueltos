package resueltos.guia3.ejercicio9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Insumo implements Facturable {

    private String nombre;
    private double porcGanancia;
    private double precioLista;
    private Tipo tipo;

    public double getMontoFacturacion() {        
        double monto = Matematica.sumarPorcentaje(precioLista, porcGanancia);     
        return Matematica.sumarPorcentaje(monto, IVA);
    }

}