
package resueltos.guia1.ejercicio9;

import java.time.LocalDate;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    private Domicilio domicilio;
    
    // Esto es un constructor

    public Persona(String nombre, String apellido, int anioNacimiento, Domicilio dom) {
        setNombre(nombre);
        setApellido(apellido);
        setAnioNacimiento(anioNacimiento);
        setDomicilio(dom);
    }
        
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public void mostrarEstado () {
        System.out.println( toString() );
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    
    
    
    public int getEdad() {
        // Hubo que importar la clase 'LocalDate'
        int anioActual = LocalDate.now().getYear();
        return anioActual - anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        if (anioNacimiento > 0) {
            this.anioNacimiento = anioNacimiento;
        }        
    }      
    
    public boolean esMayorQue(int unaEdad) {
        return getEdad() >= unaEdad;
    }
    
    public void cambiarNombreYApellido(String nuevoNombre, String nuevoApellido) {
        setNombre(nuevoNombre);
        setApellido(nuevoApellido);        
    }

    public void setNombre(String nombre) {
        if(nombre != null && nombre.length() >= 3) {
           this.nombre = nombre; 
        }
    }

    public void setApellido(String apellido) {
        if(apellido != null && apellido.length() >= 2) {
           this.apellido = apellido; 
        }
    }    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", anioNacimiento=" + anioNacimiento + ", domicilio=" + domicilio + '}';
    }

    
    
    
    
}
