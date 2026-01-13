public class MainCancion {
    public static void main(String[] args){
        //Crea una clase llamada Cancion con los atributos título, artista y duración en segundos.
        //Crea una segunda clase con un método main desde la que se creen dos objetos Cancion,
        // se seteen todos sus atributos, se muestren sus datos por pantalla usando los getters y se modifique la duración de una de ellas usando el setter.
        // A continuación, imprime el título de la canción más larga.

        //    Pokemon pokemon1=new Pokemon();
        Cancion cancion1= new Cancion();
        Cancion cancion2= new Cancion();
        Cancion cancion3= new Cancion();
        Cancion cancion4= new Cancion();
        //cancion1
       cancion1.SetTitulo("Volar");
       cancion1.setArtista("la pegatina");
       cancion1.setDuracion(215);

        //cancion2
        cancion2.SetTitulo("mentirosa");
        cancion2.setArtista("rafaga");
        cancion2.setDuracion(225);
        //cancion3
        cancion3.SetTitulo("So Payaso");
        cancion3.setArtista("Extremo Duro");
        cancion3.setDuracion(240);
        //cancion4
        cancion4.SetTitulo("Lady Madrid");
        cancion4.setArtista("leiva");
        cancion4.setDuracion(180);

        System.out.println("la cancion " + cancion1.getTitulo() + " del artista " + cancion1.getArtista() + " dura " + cancion1.getduracion() + " segundos" );
        System.out.println("la cancion " + cancion2.getTitulo() + " del artista " + cancion2.getArtista() + " dura " + cancion2.getduracion() + " segundos" );
        System.out.println("la cancion " + cancion3.getTitulo() + " del artista " + cancion3.getArtista() + " dura " + cancion3.getduracion() + " segundos" );
        System.out.println("la cancion " + cancion4.getTitulo() + " del artista " + cancion4.getArtista() + " dura " + cancion4.getduracion() + " segundos" );
    }
}
