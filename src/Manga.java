public class Manga {

    //Crea una clase Manga con los atributos título, autor, número de volumen y un boolean que indique si está leído o no.
    //Desde el main, crea un manga, muestra su información y márcalo como leído.

    private String titulo;
    private String autor;
    private int volumen ;
    boolean leido;

    //getter and setter

    public String getTitulo(){
        return titulo.toUpperCase();
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    //getter and setter autor

    public  String getAutor(){
        return autor.toUpperCase();
        
    }
    public void setAutor(String autor) {
        this.autor=autor;
    }




}
