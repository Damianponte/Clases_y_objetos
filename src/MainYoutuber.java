public class MainYoutuber {
    public static void main(String[] args) {
        //Crea una clase llamada Youtuber con los atributos nombre del canal, categoría y número de suscriptores.
        //Desde la clase principal, crea tres objetos Youtuber, setéalos e imprime y actualiza el número de suscriptores de uno de ellos.

        Youtuber youtuber1 = new Youtuber();
        Youtuber youtuber2 = new Youtuber();
        Youtuber youtuber3 = new Youtuber();

        //youtuber1
        youtuber1.setNombreCanal("margot");
        youtuber1.setCategoria("videojuegos");
        youtuber1.setSuscriptores(45);

        //youtuber2
        youtuber2.setNombreCanal("ariados");
        youtuber2.setCategoria("audicontenido");
        youtuber2.setSuscriptores(76);

        //youtuber3
        youtuber3.setNombreCanal("lucios74");
        youtuber3.setCategoria("videojuegos");
        youtuber3.setSuscriptores(86);


      System.out.println("el youtuber " + youtuber1.getNombreCanal() + "de la categoria de : " + youtuber1.getCategoria() + ", " + "tiene " + youtuber1.getSuscriptores() + " subscriptores");
      System.out.println("el youtuber " + youtuber2.getNombreCanal() + "de la categoria de : " + youtuber2.getCategoria() + ", " + "tiene " + youtuber2.getSuscriptores() + " subscriptores");
      System.out.println("el youtuber " + youtuber3.getNombreCanal() + "de la categoria de : " + youtuber3.getCategoria() + ", " + "tiene " + youtuber3.getSuscriptores() + " subscriptores");

        System.out.println("de repente se han unido 48 nuevos subcritores a: " + youtuber1.getNombreCanal());

        youtuber1.setSuscriptores(96);
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("el youtuber " + youtuber1.getNombreCanal() + "de la categoria de : " + youtuber1.getCategoria() + ", " + "tiene ahora " + youtuber1.getSuscriptores() + " subscriptores");

        Youtuber[] youtuber= {youtuber1,youtuber2,youtuber3};

        //comprobamos quien tiene mas subscriptores:
        int youtuberConMasSuscriptores= youtuber[0].getSuscriptores();

        for(int i=0;i<youtuber.length;i++){
           if( youtuberConMasSuscriptores <youtuber[i].getSuscriptores()){
               youtuberConMasSuscriptores=youtuber[i].getSuscriptores();
           }


        }

        System.out.println("el youtuber con mas subscritores  es: " + youtuberConMasSuscriptores);
    }
}


