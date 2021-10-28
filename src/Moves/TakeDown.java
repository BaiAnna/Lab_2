package Moves;
import ru.ifmo.se.pokemon.*;
public class TakeDown  extends PhysicalMove {
    public TakeDown() { super (Type.NORMAL, 90,85);}
    @Override
    protected java.lang.String describe()
    {return " Take Down deals damage, but the user receives 1⁄4 of the damage it inflicted in recoil.";}
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect effect=new Effect();
        effect.stat( Stat.HP, (int) Math.round(effect.stat(Stat.HP)*(-0.25)));
        p.addEffect(effect);}

}
