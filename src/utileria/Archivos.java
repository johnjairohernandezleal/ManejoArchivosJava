
package utileria;
import java.io.*;

public class Archivos {
    
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("El Archivo se ha creado correctamente\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void escribirArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            String contenido = "contenido a escribir en la consola";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de la Escritura");
            salida.close();
            System.out.println("Se ha Escrito Correctamente al Archivo\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            lectura = entrada.readLine();
            while (lectura!= null) {
                System.out.println("Lectura" + lectura);
                lectura = entrada.readLine();
                
            }
            entrada.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void anexarArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
            String contenido = "Anexando informacion al archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de Anexar");
            salida.close();
            System.out.println("se ha Anexado la Informacion Correctamente");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
