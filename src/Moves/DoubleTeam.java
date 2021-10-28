package Moves;
import ru.ifmo.se.pokemon.*;
public class DoubleTeam  extends StatusMove {
    public DoubleTeam() { super (Type.NORMAL, 0,0);}
    @Override
    protected java.lang.String describe()
    {return " Double Team raises the user's Evasiveness by one stage, thus making the user more difficult to hit.";}
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect effect=new Effect();
        effect.stat(Stat.EVASION, 1);
        p.addEffect(effect);
    }}
