package ui;

import data.GestorDatos;
import model.CentroCultivo;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //se llama a la clase GestorDatos, que extrae los datos del archivo .txt y los agrega a un arraylist
        GestorDatos gd = new GestorDatos();

        //Lista que almacena los centros obtenidos de GestorDatos como objeto
        ArrayList<CentroCultivo> centros = gd.cargarCentros();

        //Se extraen los datos
        System.out.println("\n...::: Todos los centros :::...");
        for (CentroCultivo c : centros) {
            System.out.println(c);
        }

        // Filtro para toneladas > 1000

        //Lista que almacena los centros con produccion mayor a 1000 toneladas
        ArrayList<CentroCultivo> mayoresA1000 = new ArrayList<>();

        //Se recorren los centros
        for (CentroCultivo c : centros) {

            if (c.getToneladas() > 1000) {

                //Se agregan al ArrayList mayoresA1000
                mayoresA1000.add(c);
            }
        }

        //Se muestran los resultados filtrados
        System.out.println("\n...::: Centros con producción > 1000 toneladas :::...");

        //Valida la existencia de centros con el filtro aplicado
        if (mayoresA1000.isEmpty()) {
            System.out.println("No hay centros con producción mayor a 1000 toneladas.");

        //Se recorre el ArrayList y se imprimen los datos filtrados.
        } else {
            for (CentroCultivo c : mayoresA1000) {
                System.out.println(c);
            }
        }

    }

}
