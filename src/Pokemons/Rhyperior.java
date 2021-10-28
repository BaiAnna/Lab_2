package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Rhyperior extends Pokemon  {
    public Rhyperior (String name,int level){
        super(name,level);
        setType(Type.GROUND, Type.ROCK);
        setStats(115,140,130,55,55,40);
        setMove(new Rest(), new Confide(), new OminousWind(), new Bulldoze());
    }
}
