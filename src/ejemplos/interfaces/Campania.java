package ejemplos.interfaces;

import java.util.ArrayList;

public class Campania {

	private ArrayList<EnviadorDeMensaje> mensajeros;
        
        public Campania() {
            mensajeros = new ArrayList<>();
        }
        
        public void agregarMensajero(EnviadorDeMensaje e) {
            this.mensajeros.add(e);
        }
	
	public void hacerCampania() {
            for (EnviadorDeMensaje mensajero : mensajeros) {
                mensajero.enviarMensaje("Voten por mi");
            }
	}

}