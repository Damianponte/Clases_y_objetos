public class JugadorFutbol {
//Crea una clase JugadorFutbol con los atributos nombre, equipo, dorsal y posición.
//Desde la clase con main, crea un jugador, muestra sus datos y después cambia el equipo y el dorsal y vuelve a mostrarlos. 

    private String nombre;
    private String equipo;
    private int dorsal;
    private String posicion;
        //getters an setters nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    //getters an setters equipo
    public String getEquipo(){
        return equipo;
    }
    public  void setEquipo(String equipo){
        this.equipo=equipo;
    }
    
    //getters an setters dorsal
    public int getDorsal(){
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal=dorsal;
    }
    //getters an setters posicion
    public String getPosicion(){
        return posicion;
    }
    
    public void setPosicion(String posicion){
        this.posicion=posicion;
    }
   
}
