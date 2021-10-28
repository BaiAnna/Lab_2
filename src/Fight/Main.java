package Fight;
import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Corphish p1 = new Corphish ("Corphish", 45);
        Crawdaunt p2 = new Crawdaunt ("Crawdaunt", 5);
        Mew p3 = new Mew ("Mew", 16);
        Rhyhorn p4 = new Rhyhorn ("Rhyhorn", 42);
        Rhydon p5 = new Rhydon ("Rhydon",34);
        Rhyperior p6 = new Rhyperior ("Rhyperior", 42);
        b.addAlly(p1);
        b.addAlly(p4);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p3);
        b.addFoe(p6);

        b.go();
    }
}