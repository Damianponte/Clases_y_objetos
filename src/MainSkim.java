public class MainSkim {
    public static void main(String[] args) {
        // Crea una clase Skin con los atributos nombre, videojuego, rareza y precio en monedas.
        // Desde el main, crea dos skins y modifica la rareza y el precio de una de ellas.


        Skin partida1=new Skin();
        Skin partida2=new Skin();

        partida1.setNombre("Damian");
        partida1.setVideojuego("Dark Soul");
        partida1.setRareza("epico");
        partida1.setMonedas(1525);

        partida2.setNombre("Bernabé");
        partida2.setVideojuego("bloodborne");
        partida2.setRareza("legendario");
        partida2.setMonedas(3539);


        System.out.println("");
        System.out.println("El jugador " + partida1.getNombre() + " que juega al juego " + partida1.getVideojuego() + " posee una skin " + partida1.getRareza() + " ,cuesta " + partida1.getMonedas() + " monedas" );
        System.out.println("El jugador " + partida2.getNombre() + " que juega al juego " + partida2.getVideojuego() + " posee una skin " + partida2.getRareza() + " ,cuesta " + partida2.getMonedas() + " monedas" );

        System.out.println("");
        System.out.println("El jugador " + partida1.getNombre() + " ha cambiado su skin");

        partida1.setNombre("Damian");
        partida1.setVideojuego("elden ring");
        partida1.setRareza("legendario");
        partida1.setMonedas(5250);

        System.out.println("");
        System.out.println("El jugador " + partida1.getNombre() + " que juega al juego " + partida1.getVideojuego() + " posee una skin " + partida1.getRareza() + " ,cuesta " + partida1.getMonedas() + " monedas" );
        System.out.println("El jugador " + partida2.getNombre() + " que juega al juego " + partida2.getVideojuego() + " posee una skin " + partida2.getRareza() + " ,cuesta " + partida2.getMonedas() + " monedas" );

    }


}
