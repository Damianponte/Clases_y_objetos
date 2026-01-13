public class Pokemon {
    private String nombre;
    private int exp;
    private int xp;
    private int vida;
    private int pp;
    private String tipo;
    private int ataque;
    private int defensa;

    //getters y setters:son metodos para modificar el estado del objeto.
    //get->recupera el valor que tiene guardado en su estado.
    //set->modifica el valor que tiene guardado en su estado.

    public String getNombre(){
        return nombre;

    }
    public void setNombre(String nombreEntrada){
        nombre=nombreEntrada;
    }

    public int getExp(){
        return exp;
    }
    public void setExp(int exp){
    this.exp=exp;
    }
//


    public int getXp(){
        return xp;
    }
    public void setXp(int xp){
    this.xp=xp;
    }

    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
    this.vida=vida;
    }
    public int getPp(){
        return pp;
    }
    public void setPp(int pp){
    this.pp=pp;
    }

    public int getAtaque(){
        return ataque;
    }
    public void setAtaque(int ataque){
    this.ataque=ataque;
    }


    public int getDefensa(){
        return defensa;
    }
    public void setDefensa(int defensa){
    this.defensa=defensa;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
    this.tipo=tipo;
    }


}
