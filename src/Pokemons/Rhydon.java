package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Rhydon extends Pokemon  {
    public Rhydon (String name,int level){
        super(name,level);
        setType(Type.GROUND, Type.ROCK);
        setStats(105,130,120,45,45,40);
        setMove(new Rest(), new Confide());
    }
}
