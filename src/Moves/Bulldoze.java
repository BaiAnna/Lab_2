package Moves;
import ru.ifmo.se.pokemon.*;
public class Bulldoze extends PhysicalMove{
    public Bulldoze (){ super(Type.GROUND, 60, 100);}
    @Override
    protected java.lang.String describe(){return " Bulldoze deals damage and lowers the target's Speed by one stage.";}
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect effect=new Effect();
        effect.stat(Stat.SPEED,-1);
        p.addEffect(effect);
    }}
