package resueltos.guia3.ejercicio9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ServicioDeReparacion extends Servicio {

    private static final double VALOR_HORA = 180;
    private static final int MIN_DIFIC = 3;
    private static final double INCR_DIF = 25;
    private int dificultad;

    public double getValorHora() {
        return VALOR_HORA;
    }

    @Override
    public double getPrecio() {
        double precio = super.getPrecio();
        if (dificultad >= MIN_DIFIC) {
            precio = Matematica.sumarPorcentaje(precio, INCR_DIF);
        } 
        return precio;
    }

    int getDificultad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}