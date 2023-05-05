/*
 */
package resueltos.guia1.ejercicio14;

/**
 *
 * @author karol
 */
public enum TipoCafe {
    EXPRESSO(0,null), LATTE(2, TexturaLeche.ESPUMOSA), LAGRIMA(3, TexturaLeche.LIQUIDA);
    
    private int cantLeche;
    private TexturaLeche textura;
    
    private TipoCafe(int cantLeche, TexturaLeche textura) {
        this.cantLeche = cantLeche;
        this.textura = textura;
    }

    public int getCantLeche() {
        return cantLeche;
    }

    public TexturaLeche getTextura() {
        return textura;
    }
    
    
    
}
