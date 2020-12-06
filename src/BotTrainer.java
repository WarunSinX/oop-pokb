public class BotTrainer extends AbstractBaseTrainer {
    public BotTrainer(String s,PokemonInterface[] p){
        super(s, p);
    }
    @Override
    public Move selectMove(PokemonInterface p){
        return p.getMove(0);
    }
}
