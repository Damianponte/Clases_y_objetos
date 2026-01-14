public class MainManga {
    public static void main(String[] args) {

        //Crea una clase Manga con los atributos título, autor, número de volumen y un boolean que indique si está leído o no.
        //Desde el main, crea un manga, muestra su información y márcalo como leído.

        Manga manga1 = new Manga();

        manga1.setTitulo("One Piece");
        manga1.setAutor("Echiro Oda");
        manga1.setVolumen(1);
        manga1.setLeido(true);

        System.out.println("");
        System.out.println(manga1.getTitulo() + " es la obra más conocida de " + manga1.getAutor());
        System.out.println(
                "Volumen: " + manga1.getVolumen() +" ¿ ha sido Leído?: " + manga1.isLeido()

        );
    }
}
