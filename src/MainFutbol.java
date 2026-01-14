public class MainFutbol {
    public static void main(String[] args) {
//Crea una clase JugadorFutbol con los atributos nombre, equipo, dorsal y posición.
//Desde la clase con main, crea un jugador, muestra sus datos y después cambia el equipo y el dorsal y vuelve a mostrarlos.

        JugadorFutbol jugador1=new JugadorFutbol();

        jugador1.setNombre("Damian");
        jugador1.setEquipo("Corme f.C");
        jugador1.setDorsal(6);
        jugador1.setPosicion("interior izquierda");

        System.out.println(" El jugador " + jugador1.getNombre() + " del equipo de futbol " + jugador1.getEquipo() + " que lleva el dorsal numero " + jugador1.getDorsal() + " juega en la posicion de " + jugador1.getPosicion());
        System.out.println("");
        System.out.println(" se han actualizado los datos del jugador " + jugador1.getNombre());
        System.out.println("ahora sus datos son:");

        System.out.println("");

        jugador1.setEquipo("Deportivo club de futbol");
        jugador1.setDorsal(3);
        jugador1.setPosicion("lateral izquierdo");

        System.out.println("El jugador " + jugador1.getNombre() + " del equipo de futbol " + jugador1.getEquipo() + " que lleva el dorsal numero " + jugador1.getDorsal() + " juega en la posicion de " + jugador1.getPosicion());

    }


}
