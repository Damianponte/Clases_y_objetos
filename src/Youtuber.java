public class Youtuber {
    //Crea una clase llamada Youtuber con los atributos nombre del canal, categoría y número de suscriptores.
    //Desde la clase principal, crea tres objetos Youtuber, setéalos e imprime y actualiza el número de suscriptores de uno de ellos.

    private String nombreCanal;
    private String categoria;
    private int suscriptores;

    //hacemos los getters y los setters nombre canal

    public String getnombreCanal(){
        return nombreCanal;
    }
    public void setNombreCanal(String nombreCanal){
        this.nombreCanal=nombreCanal;
    }
    //hacemos los getters y los setters categoria

    public String categoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }
    //hacemos los getters y los setters suscriptores
    public int getSuscriptores(){
        return suscriptores;
    }
    public void setSuscriptores(int suscriptores){
        this.suscriptores=suscriptores;
    }
}
