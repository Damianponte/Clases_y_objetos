public class Cancion {
        //Crea una clase llamada Cancion con los atributos título, artista y duración en segundos.
        //Crea una segunda clase con un método main desde la que se creen dos objetos Cancion,
        // se seteen todos sus atributos, se muestren sus datos por pantalla usando los getters y se modifique la duración de una de ellas usando el setter.
        // A continuación, imprime el título de la canción más larga.
    private String titulo;
    private String artista;
    private int duracion;
//titulo
    public String getTitulo(){
        return titulo;
}
    public void setTitulo(String tituloEntrada) {
        titulo = tituloEntrada;
    }

    // artista
    public String getArtista(){
        return artista;
    }
    public void setArtista(String artista){
    this.artista=artista;
    }

    // duracion
    public int getduracion(){
        return duracion;
    }
    public void setDuracion(int duracion){
        this.duracion=duracion;
    }





}