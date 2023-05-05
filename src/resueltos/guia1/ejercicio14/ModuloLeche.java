/*
 */
package resueltos.guia1.ejercicio14;

/**
 *
 * @author karol
 */
public class ModuloLeche {
    //esto de static final está bueno, xq es como la cant de cuotas del Ej 13 de Posnet.
    //Pero no estoy segura de si imprescindible para este ejercicio.
    public static final int MIN_CANT_LIQUIDO = 0;
    public static final int MAX_CANT_LIQUIDO = 5;
    
    private int cantliquido;
    private TexturaLeche texturaActual;
    
    
    public ModuloLeche(){
        this.cantliquido = MIN_CANT_LIQUIDO;
        this.texturaActual = TexturaLeche.LIQUIDA;
    }

    public void setTexturaActual(TexturaLeche texturaActual) {
        this.texturaActual = texturaActual;
    }
    
    

    public int getCantliquido() {
        return cantliquido;
    }

    public TexturaLeche getTextura() {
        return texturaActual;
    }
    
    
    public void agregarLeche(int puntosLeche){
        int aux = cantliquido + puntosLeche;
        if (aux > MAX_CANT_LIQUIDO) {
            this.cantliquido = MAX_CANT_LIQUIDO;
        } else {
            this.cantliquido = aux;
        }
    }
    
    
    public void setCantidadLeche(int puntosLeche){
        agregarLeche(puntosLeche);
    }
    
    public void descontarLeche(int puntosLeche){
        cantliquido -= puntosLeche;
    }
    
    public boolean tenesLecheSuficiente(int puntosLeche){
        return cantliquido >= puntosLeche;
    }
}
