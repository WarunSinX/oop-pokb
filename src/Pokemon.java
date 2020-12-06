public class Pokemon implements PokemonInterface {
    protected String name;
    protected Move[] moves;
    protected Type type;
    protected int hp;
    protected int attack;
    protected int defense;
    protected int speed;

    public Pokemon(String n,Move[] m,Type t,int hp,int atk,int def,int spd) throws IllegalArgumentException
    {  if(m.length != NUM_MOVES || hp<=0 || atk <=0|| def<=0 || spd<=0) throw new IllegalArgumentException("Can't to input like this BRO!!");
        this.name = n;
        this.moves = m;
        this.type = t;
        this.hp = hp;
        this.attack =atk;
        this.defense = def;
        this.speed = spd;
    }

    @Override
    public int getAttackStat(){
        return attack;
    }
    @Override
    public int getSpeedStat(){
        return speed;
    }
    @Override
    public int getDefenseStat(){
        return defense;
    }
    @Override
    public int getHPStat(){
        return hp;
    }
    @Override
    public int takeHit(PokemonInterface p,MoveInterface m){
        if(m.getType() == Type.FIRE) {
            if(this.type == Type.FIRE){
                //effect
                this.hp= hp -(int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.WATER){
                this.hp = hp -(int)((0.5*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((0.5*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GRASS){
                this.hp = hp-(int)((2.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((2.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.NORMAL){
                this.hp = hp- (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GHOST){
                this.hp = hp -(int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
        }
        else if(m.getType() == Type.WATER){
            if(this.type == Type.FIRE){
                //effect
                this.hp = hp -(int)((2.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((2.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.WATER){
                this.hp = hp -(int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GRASS){
                this.hp = hp -(int)((0.5*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((0.5*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.NORMAL){
                this.hp = hp -(int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GHOST){
                this.hp = hp -(int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
        }
        else if(m.getType() == Type.GRASS){
            if(this.type == Type.FIRE){
                //effect
                this.hp = hp -(int)((0.5*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((0.5*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.WATER){
                this.hp = hp -(int)((2.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((2.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GRASS){
                this.hp = hp -(int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.NORMAL){
                this.hp = hp -(int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GHOST){
                this.hp = hp -(int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
        }
        else if(m.getType() == Type.NORMAL){
            if(this.type == Type.FIRE){
                //effect
                this.hp = hp -(int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.WATER){
                this.hp = hp -(int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GRASS){
                this.hp = hp -(int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.NORMAL){
                this.hp = hp -(int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GHOST){
                this.hp = hp -(int)((0.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((0.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
        }
        else if(m.getType() == Type.GHOST){
            if(this.type == Type.FIRE){
                //effect
                this.hp = hp -(int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.WATER){
                this.hp = hp -(int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GRASS){
                this.hp = hp -(int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.NORMAL){
                this.hp = hp -(int)((0.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((0.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GHOST){
                this.hp = hp -(int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
        }
        return 1;
        
    }
    @Override
    public boolean faint(){
        return hp <= 0 ? true : false;
    }
    @Override
    public Move selectAttackMove(TrainerInterface t){
        return (Move)t.selectMove(this);
    }
    @Override
    public Move getMove(int n) throws ArrayIndexOutOfBoundsException
    {   if(n <0 || n>= NUM_MOVES) throw new ArrayIndexOutOfBoundsException("Move is more than 0 ma bro");
        return moves[n];
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String movesToString(){
        return "[0]"+" "+moves[0].getMoveName()+": [1] " + moves[1].getMoveName()+": ";
    }
    @Override
    public PokemonInterface clonePokemon() {
        Pokemon p = new Pokemon(this.name, this.moves, this.type, this.hp, this.attack, this.defense, this.speed);
        return p;
    }
}
