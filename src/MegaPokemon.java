public class MegaPokemon extends Pokemon {
    public MegaPokemon(Pokemon p){
        super("Mega"+p.name, p.moves, p.type, p.hp, (int)(p.attack*1.25), (int)(p.defense*1.25) , p.speed);
    }

    @Override
    public PokemonInterface clonePokemon(){
        return this;
    }
}
