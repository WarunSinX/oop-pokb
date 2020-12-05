public interface PokemonInterface {
    public final int NUM_MOVES = 2;

    public int getAttackStat();
    public int getSpeedStat();
    public int getDefenseStat();
    public int getHPStat();
    public int takeHit(PokemonInterface p,MoveInterface m);
    public boolean faint();
    public Move selectAttackMove(TrainerInterface a);
    public Move getMove(int m);
    public String getName();
    public String movesToString();
    public PokemonInterface clonePokemon();
}
