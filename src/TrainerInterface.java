public interface TrainerInterface {
    public final int NUM_MAX_POKEMONS =4;
    public String getName();
    public PokemonInterface getCurrentPokemon();
    public boolean sendNewPokemon();
    public PokemonInterface getPokemon(int a);
    public int getNumAlivePokemon();
    public MoveInterface selectMove(PokemonInterface A);
}
