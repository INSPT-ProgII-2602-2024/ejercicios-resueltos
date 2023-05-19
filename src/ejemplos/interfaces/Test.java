package ejemplos.interfaces;

public class Test {
	
    public static void main(String[] args) {
            Campania c = new Campania();
            c.agregarMensajero( new PalomaMensajera() );
            c.agregarMensajero( new TelefonoMovil() );
            c.agregarMensajero( new PalomaMensajera() );
            c.agregarMensajero( new TelefonoMovil() );
            c.agregarMensajero( new PalomaMensajera() );
            c.agregarMensajero( new Persona() );
            c.hacerCampania();
    }

}