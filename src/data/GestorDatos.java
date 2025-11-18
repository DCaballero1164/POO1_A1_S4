package data;

import java.io.*;
import java.util.ArrayList;
import model.CentroCultivo;

public class GestorDatos {

    //Metodo que carga los centros desde el archivo .../resources/centros.txt
    public ArrayList<CentroCultivo> cargarCentros() {

        //Mensaje al inicio de lectura de datos
        System.out.println("Lectura de datos desde el archivo .txt");

        //Se crea la lista para almacenar los centros de cultivos leidos
        ArrayList<CentroCultivo> centrosLeidos = new ArrayList<>();

        //Se leen los datos del archivo .txt
        try {
            //Nombre del archivo .txt
            String nombreArchivo = "centros.txt";

            //Ruta del archivo
            String rutaArchivo = "resources/";

            // Cargar archivo desde la carapeta resources
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo+nombreArchivo));

            String linea;
            while ((linea = br.readLine()) != null) {
                // Separar por ';'
                String[] partes = linea.split(";");

                //lectura solo de lineas con 3 datos
                if (partes.length == 3) {
                    String nombre = partes[0].trim();
                    String comuna = partes[1].trim();
                    int produccion = Integer.parseInt(partes[2].trim());

                    //Se agregan los centros del archivo al Arraylist centrosLeidos como objeto
                    centrosLeidos.add(new CentroCultivo(nombre, comuna, produccion));
                }
            }
            br.close();

        //Excepcion en caso de no leer el archivo
        } catch (Exception e) {
            System.out.println("Error leyendo el archivo: " + e.getMessage());
        }

        return centrosLeidos;

    }
}
