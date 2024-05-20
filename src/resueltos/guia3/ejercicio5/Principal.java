package resueltos.guia3.ejercicio5;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        Computadora compu = new Computadora();
        Archivo a1 = new Archivo("Genérico", 1, "C:/");
        ArchivoTexto a2 = new ArchivoTexto("UTF-8", "Lista de supermecado", 10, "D:/Documentos");
        // No se puede: a3 = new ArchivoMultimedia(0, "", 0, "");
        ArchivoMultimedia a3 = new ArchivoAudio("", "", FormatoAudio.FLAC, 0, "", 0, ""); 
        ArchivoAudio a4 = new ArchivoAudio("Queen", "Bohemian Rapsody", FormatoAudio.MP3, 3689, "Bohemian Rapsody", 14063, "Mi música");
        ArchivoVideo a5 = new ArchivoVideo(FormatoVideo.MP4, 1920, 1080, 7263, "Terminator 2", 1569863, "Altas pelis");
        
        compu.agregarArchivo(a2);
        compu.agregarArchivo(a4);
        compu.agregarArchivo(a1);
        compu.agregarArchivo(a3);
        compu.agregarArchivo(a5);
        
        compu.listar();
        System.out.println(compu.cantArchivosDeTexto());
    }

}