package Moves;
import ru.ifmo.se.pokemon.*;
public class OminousWind extends SpecialMove {
    public OminousWind() { super (Type.GHOST, 60,100);}
    @Override
    protected java.lang.String describe()
    {return "Ominous Wind deals damage and has a 10% chance of raising the user's Attack, Defense, Special Attack, Special Defense and Speed by one stage each.";}
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect effect=new Effect();
        effect.chance(0.1);
        effect.stat(Stat.ATTACK, 1);
        effect.stat(Stat.DEFENSE, 1);
        effect.stat(Stat.SPECIAL_ATTACK, 1);
        effect.stat(Stat.SPECIAL_DEFENSE, 1);
        effect.stat(Stat.SPEED, 1);
        p.addEffect(effect);
    }
    @Override
    protected double calcCriticalHit(Pokemon att,Pokemon def){
        if (att.getStat(Stat.SPEED) / 512.0D > Math.random()) {
            return 2.0D;
        } else {
            return 1.0D;
        }}}