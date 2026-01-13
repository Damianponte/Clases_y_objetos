public class MainPelicula {
    public static void main(String[] args) {
        //  Crea una clase llamada Pelicula con los atributos título, director, año de estreno y duración en minutos.
        //   Desde una clase con main, crea un objeto Pelicula, setea todos sus datos,
        //   muestra todos sus datos y modifica el director usando el setter para que esté escrito en mayúsculas ("toUpperCase()")

        Pelicula pelicula1 = new Pelicula();
        Pelicula pelicula2 = new Pelicula();
        Pelicula pelicula3 = new Pelicula();
        Pelicula pelicula4 = new Pelicula();


        //pelicula1
        pelicula1.setTitulo("la ira");
        pelicula1.setDirector("alejo");
        pelicula1.setAñoEstreno(1972);
        pelicula1.setDuracion(122);

        //pelicula2
        pelicula2.setTitulo("los vengadores");
        pelicula2.setDirector("paco");
        pelicula2.setAñoEstreno(2019);
        pelicula2.setDuracion(180);

        pelicula3.setTitulo("detective conan");
        pelicula3.setDirector("osho");
        pelicula3.setAñoEstreno(2014);
        pelicula3.setDuracion(145);

        pelicula4.setTitulo("pokemon el regreso de mewtwo");
        pelicula4.setDirector("ishin");
        pelicula4.setAñoEstreno(2018);
        pelicula4.setDuracion(118);

        System.out.println("la pelicula " + pelicula1.getTitulo() + " del director " + pelicula1.getDirector() + " del año " + pelicula1.getAñoEstreno() + " dura " + pelicula1.getduracion() + " minutos");
        System.out.println("la pelicula " + pelicula2.getTitulo() + " del director " + pelicula2.getDirector() + " del año " + pelicula2.getAñoEstreno() + " dura " + pelicula2.getduracion() + " minutos");
        System.out.println("la pelicula " + pelicula3.getTitulo() + " del director " + pelicula3.getDirector() + " del año " + pelicula3.getAñoEstreno() + " dura " + pelicula3.getduracion() + " minutos");
        System.out.println("la pelicula " + pelicula4.getTitulo() + " del director " + pelicula4.getDirector() + " del año " + pelicula4.getAñoEstreno() + " dura " + pelicula4.getduracion() + " minutos");


        System.out.println("");
        System.out.println("modificamos el director de las pelicula1 a jordan");

        pelicula1.setDirector("jordan");
        System.out.println("la pelicula " + pelicula1.getTitulo() + " del director " + pelicula1.getDirector() + " del año " + pelicula1.getAñoEstreno() + " dura " + pelicula1.getduracion() + " minutos");

    }
}
