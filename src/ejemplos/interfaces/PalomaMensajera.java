package ejemplos.interfaces;

public class PalomaMensajera extends Ave implements EnviadorDeMensaje {
	
	public void enviarMensaje(String mensaje) {
            volar();
            System.out.println("Volando por los aires y lanzando un papelito que dice: " + mensaje);
	}

	public void volar() {
		// Método a resolver...
	}

}