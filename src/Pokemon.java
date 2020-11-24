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

    }
    @Override
    public int getSpeedStat(){

    }
    @Override
    public int getDefenseStat(){

    }
    @Override
    public int getHpStat(){

    }
    @Override
    public int takeHit(PokemonInterface p,MoveInterface m){

    }
    @Override
    public boolean faint(){

    }
    @Override
    public Move selectAttackMove(TrainerInterface t){

    }
    @Override
    public Move getMove(int a){

    }
    @Override
    public String getName(){

    }
    @Override
    public String movesToString(){

    }
    @Override
    public PokemonInterface clonePokemon(){
        
    }
}
