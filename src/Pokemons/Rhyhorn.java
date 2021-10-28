package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Rhyhorn extends Pokemon  {
    public Rhyhorn (String name,int level){
        super(name,level);
        setType(Type.GROUND, Type.ROCK);
        setStats(80,85,95,30,30,25);
        setMove(new Rest(), new Confide());
    }
}
