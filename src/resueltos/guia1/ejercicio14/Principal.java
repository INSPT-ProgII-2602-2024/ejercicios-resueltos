/*
 */
package resueltos.guia1.ejercicio14;

/**
 *
 * @author karol
 */
public class Principal {
    
    public static void main(String[] args) {
        MaquinaCafe mc = new MaquinaCafe("Oster");
        String msj;
        
        mc.encender();
        mc.recargarLeche(5);
        mc.calentar();
        msj = mc.servirCafe( TipoCafe.LATTE );        
        System.out.println(msj);
        msj = mc.servirCafe( TipoCafe.LATTE );        
        System.out.println(msj);
        msj = mc.servirCafe( TipoCafe.EXPRESSO );        
        System.out.println(msj);
        msj = mc.servirCafe( TipoCafe.LAGRIMA );        
        System.out.println(msj);
    }
    
}
