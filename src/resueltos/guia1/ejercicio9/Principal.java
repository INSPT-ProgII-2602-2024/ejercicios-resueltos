
package resueltos.guia1.ejercicio9;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        Domicilio dom = new Domicilio("San Javier", 123, "Beriso");
        Persona p = new Persona("Juan","Perez",1990,dom);
        
        p.mostrarEstado();
        
    }

}
