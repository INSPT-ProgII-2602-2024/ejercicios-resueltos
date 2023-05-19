
package ejemplos.interfaces;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Persona implements EnviadorDeMensaje {

    public Persona() {
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Yendo casa x casa a decir: " + mensaje);
    }

}
