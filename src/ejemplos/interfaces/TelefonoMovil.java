package ejemplos.interfaces;

public class TelefonoMovil extends DispositivoElectronico implements EnviadorDeMensaje {
	
	public void enviarMensaje(String mensaje) {
            System.out.println("Enviando mensaje por Whatsapp que dice " + mensaje);
	}

	public void encender() {
		// Método a resolver...
	}

}