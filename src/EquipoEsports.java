public class EquipoEsports {

   // Crea una clase EquipoEsports con los atributos nombre, juego, país y ranking mundial.

   private String nombre;
   private String juego;
   private String pais;
   private int ranking;

    public String getNombre(){
        return nombre.toUpperCase();
    }
    public void setNombre(String nombre){
        this.nombre=nombre.toUpperCase();

    }


    public String getJuego(){
        return juego;

    }
    public void setJuego(String juego){
        this.juego=juego;
    }

    public String getPais(){
        return pais.toUpperCase();
    }
    public void setPais(String pais){
        this.pais=pais;
    }

    public int getRanking(){
        return ranking;
    }
    public void setRanking(int ranking){
        this.ranking=ranking;

    }
}
