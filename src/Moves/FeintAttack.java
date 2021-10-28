package Moves;
import ru.ifmo.se.pokemon.*;
public class FeintAttack extends PhysicalMove {
    public FeintAttack () {super(Type.DARK,60,10000); }
    @Override
    protected java.lang.String describe() { return "Feint Attack deals damage and ignores changes to the Accuracy and Evasion stats."; }
    @Override
    protected double calcCriticalHit(Pokemon att,Pokemon def){
        if (att.getStat(Stat.SPEED) / 512.0D > Math.random()) {
            return 2.0D;
        } else {
            return 1.0D;
        }}}