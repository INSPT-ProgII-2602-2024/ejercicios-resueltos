/*
 */
package resueltos.guia1.ejercicio14;

/**
 *
 * @author karol
 */
public class ModuloAgua {
    private double temperatura;
    private boolean mantenimiento;
    private static final int TEMP_MIN_PARA_HACER_CAFE = 70;
    
    //constructor  
    public ModuloAgua() {
        this.temperatura = 20; //por poner una Tº inicial
        this.mantenimiento = false;
    }

    
    public double getTemperatura() {
        return temperatura;
    }

    public boolean isMantenimiento() {
        return mantenimiento;
    }
    
    
    public void setTemperatura(double temp){
        this.temperatura = temp;
    }
    
    
    public void calentarAgua(){
        setTemperatura(TEMP_MIN_PARA_HACER_CAFE);
    }

    public boolean estaEnCondiciones() {
        return !isMantenimiento() && this.temperatura >= TEMP_MIN_PARA_HACER_CAFE;
    }
}
