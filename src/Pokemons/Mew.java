package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Mew extends Pokemon  {
    public Mew  (String name,int level){
        super(name,level);
        setType(Type.PSYCHIC);
        setStats(100,100,100,100,100,100);
        setMove(new FeintAttack(), new DoubleTeam(), new Confide(), new Swagger());
    }
}
