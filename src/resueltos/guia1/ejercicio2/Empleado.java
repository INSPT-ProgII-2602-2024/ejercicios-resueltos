package resueltos.guia1.ejercicio2;

public class Empleado {
    private int DNI;
    private String nombre;
    private String apellido;
    private double salarioBase;
    private EstadoCivil estadocivil;
    private int hijos;

    public Empleado(int DNI, String nombre, String apellido, double salariobase, EstadoCivil estadocivil, int hijos) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salariobase;
        this.estadocivil = estadocivil;
        this.hijos = hijos;
    }

    public double obtenerSalarioFinal() {        
        double salario = salarioBase + plusPorHijos();
        return dctoPorEstadoCivil(salario);
    }
    
    private double plusPorHijos() {
        double porc = 0.03 * hijos;
        if (porc > 0.1){
            porc = 0.1;
        } 
        return salarioBase * porc;
    }

    private double dctoPorEstadoCivil(double salario) {
        return estadocivil != EstadoCivil.SOLTERO ? salario : salario / 1.04;
    }

    @Override
    public String toString() {
        return "Empleado{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", salarioBase=" + salarioBase + ", estadocivil=" + estadocivil + ", hijos=" + hijos + '}';
    }

    
    
}
