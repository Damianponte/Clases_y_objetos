public class MainEquipoEsports {
    public static void main(String[] args) {
        // Crea una clase EquipoEsports con los atributos nombre, juego, país y ranking mundial.
        // Desde la clase principal, crea un equipo y modifica su ranking.

        EquipoEsports equipo1=new EquipoEsports();
        EquipoEsports equipo2=new EquipoEsports();

        //equipo 1

        equipo1.setNombre("Corme crew");
        equipo1.setJuego("LOL");
        equipo1.setPais("España");
        equipo1.setRanking(2);

        //equipo 2

        equipo2.setNombre("murders");
        equipo2.setJuego("LOL");
        equipo2.setPais("EEUU");
        equipo2.setRanking(1);


        System.out.println("el equipo " + equipo1.getNombre() + " de " + equipo1.getPais() + " esta en el numero  " + equipo1.getRanking() + " del " + equipo1.getJuego());
        System.out.println("el equipo " + equipo2.getNombre() + " de " + equipo2.getPais() + " esta en el numero " + equipo2.getRanking() + " del " + equipo2.getJuego());

        System.out.println();
        System.out.println("tenemos un cambio!!!");
        System.out.println(equipo1.getNombre() + " ha vencido a los " + equipo2.getNombre() + "!!!!!!" );
        System.out.println("las posiciones han cambiado!!!!");

        equipo1.setRanking(1);
        equipo2.setRanking(2);

        System.out.println("los campeones son!!!");

        System.out.println("el equipo " + equipo1.getNombre() + " de " + equipo1.getPais() + " se ha quedado con el puesto numero  " + equipo1.getRanking() + " del " + equipo1.getJuego() + "!!!!");

    }
}
