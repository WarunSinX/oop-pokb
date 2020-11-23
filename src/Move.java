public class Move implements MoveInterface {
    protected Type type;
    protected int baseDamage;
    protected String name;
    
    public Move(Type t, int bDmg, String n) {
        type =t;
        baseDamage = bDmg;
        name = n;
    }

    @Override
    public Type getType() {
        return type;
    }
    
    @Override
    public int getBaseDamage() {
        return baseDamage;
    }

    @Override
    public String getMoveName() {
        return name;
    }

}
