public class Skin {
   // Crea una clase Skin con los atributos nombre, videojuego, rareza y precio en monedas.
   // Desde el main, crea dos skins y modifica la rareza y el precio de una de ellas.

    private String nombre;
    private String videojuego;
    private String rareza;
    private int monedas;


        //getter and setter nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    //getter and setter videojuego
    public String getVideojuego(){
        return videojuego;
    }
    public void setVideojuego(String videojuego){
        this.videojuego=videojuego;
    }

    //getter and setter rareza
    public String getRareza(){
        return rareza;
    }

    public void setRareza(String rareza){
        this.rareza=rareza;
    }

    //getter and setter monedas

    public int getMonedas(){
        return monedas;
    }

    public void setMonedas(int monedas){
        this.monedas=monedas;
    }
    

}
