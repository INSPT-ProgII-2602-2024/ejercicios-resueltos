/*
 */
package resueltos.guia1.ejercicio14;

/**
 *
 * @author karol
 */
public class MaquinaCafe {
    private String marca;
    private boolean encendida; //false por defecto.
    private ModuloAgua moduloAgua;
    private ModuloLeche moduloLeche;
    
    public MaquinaCafe(String marca) {
        this.marca = marca;
        this.moduloAgua = new ModuloAgua();
        this.moduloLeche = new ModuloLeche();
    }
    
    public void encender() {
        this.encendida = !this.encendida;
    }
    
    
    public String servirCafe(TipoCafe tc) {
       String mensaje;
       if (this.encendida) {
           if ( moduloLeche.tenesLecheSuficiente(tc.getCantLeche()) ) {
               if ( moduloAgua.estaEnCondiciones() ) {
                   moduloLeche.setTexturaActual(tc.getTextura());
                   moduloLeche.descontarLeche(tc.getCantLeche());             
                   mensaje = "El café %s se ha servido correctamente";
               } else {
                    mensaje = "Módulo de agua no está en condiciones para hacer un %s";
               }               
           } else {
               mensaje = "No hay leche suficiente para hacer un %s";
           }
       }
       else {
           mensaje = "La maquina esta apagada";
       }
       // System.out.printf(mensaje, tc.name());
       return String.format(mensaje, tc.name());
   }

    public void recargarLeche(int cant) {
        moduloLeche.agregarLeche(cant);
    }
    
    public void calentar() {
        moduloAgua.calentarAgua();
    }
    
    
}
