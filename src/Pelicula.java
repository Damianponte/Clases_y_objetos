public class Pelicula {
 //  Crea una clase llamada Pelicula con los atributos título, director, año de estreno y duración en minutos.
 //   Desde una clase con main, crea un objeto Pelicula, setea todos sus datos,
    //   muestra todos sus datos y modifica el director usando el setter para que esté escrito en mayúsculas ("toUpperCase()")

    private String titulo;
    private String director;
    private int añoEstreno;
    private double duracion;
        //get y set de titulo
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //get y set de director
    public String getDirector(){
        return director;
    }
    public void setDirector(String director) {
        this.director = director.toUpperCase();
    }
//get y set de año
    public int getAñoEstreno(){
        return añoEstreno;
    }
    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }
    //get y set de duracion
    public double getduracion(){
        return duracion;
    }
    public void setDuracion(double duracion){
        this.duracion=duracion;
    }

}
