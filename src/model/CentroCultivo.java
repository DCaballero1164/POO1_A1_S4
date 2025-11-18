package model;

//Clase que contiene los datos de cultivo de la salmonera
public class CentroCultivo {

    //Definicion de Atributos
    private String nombre;  //Almacena el nombre del centro de cultivo
    private String comuna;  //Almacena la comuna en donde se ubica
    private int toneladas;  //Almacena las toneladas recolectadas en el lugar

    //Constructor de la clase CentroCultivo
    public CentroCultivo(String nombre, String comuna, int toneladas) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.toneladas = toneladas;
    }

    //Getter
    public String getComuna() {
        return comuna;
    }

    public String getNombre() {
        return nombre;
    }

    public int getToneladas() {
        return toneladas;
    }

    //Setter
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "CentroCultivo{" +
                "nombre='" + getNombre() + '\'' +
                ", comuna='" + getComuna() + '\'' +
                ", toneladas=" + getToneladas() +
                '}';
    }

}
