public class MainPokemon {
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        //new es un constructor de objetos
        //Pokemon es la clase:
        //pokemon1 es el objeto:

        Pokemon pokemon1=new Pokemon();
        Pokemon pokemon2=new Pokemon();
        //pokemon 1
        pokemon1.setNombre("Pikachu");
        pokemon1.setExp(2);
        pokemon1.setXp(15);
        pokemon1.setAtaque(6);
        pokemon1.setVida(25);
        pokemon1.setDefensa(12);
        pokemon1.setTipo("Electrico");
        pokemon1.setPp(10);


        //pokemon2
        pokemon2.setNombre("Charmander");
        pokemon2.setExp(2);
        pokemon2.setXp(15);
        pokemon2.setAtaque(7);
        pokemon2.setVida(24);
        pokemon2.setDefensa(10);
        pokemon2.setTipo("fuego");
        pokemon2.setPp(9);




        System.out.println("el pokemon 1 es:" + pokemon1.getNombre());
        System.out.println("el pokemon 2 es:" + pokemon2.getNombre());


        System.out.println("comienza el combate del siglo!!!!!!!!!");
        System.out.println("a la derecha tenemos a Pikachu con su tipo " + pokemon1.getTipo() + " !!!! ");
        System.out.println("a la izquierda tenemos a charmander con su tipo " + pokemon2.getTipo() + " !!!! ");


        while (pokemon1.getVida() > 0 && pokemon2.getVida() > 0) {

            // Pikachu ataca
            System.out.println("Pikachu ataca a Charmander con " + pokemon1.getAtaque() + " puntos");
            pokemon2.setVida(pokemon2.getVida() - pokemon1.getAtaque());

            if (pokemon2.getVida() < 0) {
                pokemon2.setVida(0);
            }

            System.out.println("La vida de Charmander es " + pokemon2.getVida());


            if (pokemon2.getVida() <= 0) {
                break;
            }


            System.out.println("Charmander ataca a Pikachu con " + pokemon2.getAtaque() + " puntos");
            pokemon1.setVida(pokemon1.getVida() - pokemon2.getAtaque());

            if (pokemon1.getVida() < 0) {
                pokemon1.setVida(0);
            }

            System.out.println("La vida de Pikachu es " + pokemon1.getVida());
        }

        // quien gana
        if (pokemon1.getVida() <= 0) {
            System.out.println(pokemon2.getNombre() + " ha ganado");
        } else {
            System.out.println(pokemon1.getNombre() + " ha ganado");
        }
    }
}
