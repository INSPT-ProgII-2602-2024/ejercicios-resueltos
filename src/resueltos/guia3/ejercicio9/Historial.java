package resueltos.guia3.ejercicio9;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Historial {

    private ArrayList<Facturable> facturables;

    public double montoTotalFacturado() {
        double total = 0;
        for (Facturable facturable : facturables) {
            total += facturable.getMontoFacturacion();
        }
        return total;
    }

    public int cantServiciosSimples() {
        int cont = 0;
        for (Facturable f : facturables) {
            if ( esServicioSimple(f) ) {
                cont++;
            }
        }
        return cont;
    }
    
    private boolean esServicioSimple(Facturable f) {
        return f instanceof ServicioDeReparacion && ((ServicioDeReparacion) f).getDificultad() < 2;
                                                        // downcasting
    }

}