public class Utility {

    private static Pokemon CHARIZARD, BLASTOISE, VANUSAUR, KANGASKHAN, BANETTE;
    private static MegaPokemon MEGA_CHARIZARD, MEGA_BLASTOISE, MEGA_VANUSAUR, MEGA_KANGASKHAN, MEGA_BANETTE;
    
    public static final Move STOMP = new Move(Type.NORMAL, 65, "Stomp");
    public static final Move SHADOWBALL = new Move(Type.GHOST, 80, "Shadow Ball");
    public static final Move FLAMETHROWER = new Move(Type.FIRE, 90, "Flamethrower");
    public static final Move SURF = new Move(Type.WATER, 90, "Surf");
    public static final Move ENERGYBALL = new Move(Type.GRASS, 90, "Energy Ball");

    public static final PokemonInterface[] ALL_POKEMONS = {
        CHARIZARD = new Pokemon("Charizard", new Move[]{FLAMETHROWER, STOMP}, Type.FIRE, 266, 173, 161, 205),
        BLASTOISE = new Pokemon("Blastoise", new Move[]{SURF, SHADOWBALL}, Type.WATER, 268, 171, 205, 161),
        VANUSAUR = new Pokemon("Venusaur", new Move[]{ENERGYBALL, STOMP}, Type.GRASS, 270, 169, 171, 165),
        KANGASKHAN = new Pokemon("Kangaskhan", new Move[]{STOMP, FLAMETHROWER}, Type.NORMAL, 320, 195, 165, 185),
        BANETTE = new Pokemon("Banette", new Move[]{SHADOWBALL, ENERGYBALL}, Type.GHOST, 238, 235, 135, 135),
        MEGA_CHARIZARD = new MegaPokemon(CHARIZARD),
        MEGA_BLASTOISE = new MegaPokemon(BLASTOISE),
        MEGA_VANUSAUR = new MegaPokemon(VANUSAUR),
        MEGA_KANGASKHAN = new MegaPokemon(KANGASKHAN),
        MEGA_BANETTE = new MegaPokemon(BANETTE)
    };

}
