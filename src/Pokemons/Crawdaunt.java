package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;
public class Crawdaunt extends Pokemon  {
    public Crawdaunt (String name,int level){
        super(name,level);
        setType(Type.WATER);
        setStats(63,120,85,90,55,55);
        setMove(new Rest(), new Swagger());
    }
}
