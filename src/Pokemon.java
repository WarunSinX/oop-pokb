public class Pokemon implements PokemonInterface {
    protected String name;
    protected Move[] moves;
    protected Type type;
    protected int hp;
    protected int attack;
    protected int defense;
    protected int speed;

    public Pokemon(String n,Move[] m,Type t,int hp,int atk,int def,int spd){
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
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.WATER){
                return (int)((0.5*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GRASS){
                return (int)((2.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.NORMAL){
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GHOST){
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
        }
        else if(m.getType() == Type.WATER){
            if(this.type == Type.FIRE){
                //effect
                return (int)((2.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.WATER){
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GRASS){
                return (int)((0.5*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.NORMAL){
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GHOST){
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
        }
        else if(m.getType() == Type.GRASS){
            if(this.type == Type.FIRE){
                //effect
                return (int)((0.5*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.WATER){
                return (int)((2.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GRASS){
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.NORMAL){
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GHOST){
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
        }
        else if(m.getType() == Type.NORMAL){
            if(this.type == Type.FIRE){
                //effect
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.WATER){
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GRASS){
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.NORMAL){
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GHOST){
                return (int)((0.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
        }
        else if(m.getType() == Type.GHOST){
            if(this.type == Type.FIRE){
                //effect
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.WATER){
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GRASS){
                return (int)((1.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.NORMAL){
                return (int)((0.0*m.getBaseDamage()*p.getAttackStat())/this.defense);
            }
            else if(this.type == Type.GHOST){
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
    public Move getMove(int n){
        return moves[n];
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String movesToString(){
        return moves[0].getMoveName() + moves[1].getMoveName();
    }
    @Override
    public PokemonInterface clonePokemon(){
        return this;
    }
}
