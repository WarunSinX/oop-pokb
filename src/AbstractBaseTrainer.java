public abstract class AbstractBaseTrainer implements TrainerInterface {
    protected PokemonInterface[] pokemons;
    protected PokemonInterface currentPokemon;
    protected String name;

    public AbstractBaseTrainer(String n,PokemonInterface[] p) throws IllegalArgumentException
    {   if(p.length>NUM_MAX_POKEMONS) throw new IllegalArgumentException("Is should less or equal to NUM_MAX_POKEMONS");
        this.name = n;
        this.pokemons = p;
        this.currentPokemon = pokemons[0];
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public PokemonInterface getCurrentPokemon(){
        return this.currentPokemon;
    }
    @Override 
    public boolean sendNewPokemon(){
        if(this.currentPokemon.faint() == false || this.isDefeated() == true ){
            return false;
        }
        else{
            for(int i=0;i<=pokemons.length ;i++){
                if(pokemons[i].faint()==false){
                    this.currentPokemon = pokemons[i];
                    break;
                }
            }
            return true;
        }
        
    }
    @Override
    public boolean isDefeated(){
        int check=0;
        for(int i=0; i<pokemons.length; i++){
            if(pokemons[i].faint()==true){
                check++;
            }
        }
        if(check==pokemons.length){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public PokemonInterface getPokemon(int i)throws ArrayIndexOutOfBoundsException
    {   if(i<0||i>=NUM_MAX_POKEMONS) throw new ArrayIndexOutOfBoundsException("Error ma bro!!");
        return this.pokemons[i];
    }

    @Override
    public int getNumAlivePokemons(){
        int check=0;
        for(int i=0; i<pokemons.length; i++){
            if(pokemons[i].faint()==false){
                check++;
            }
        }
        return check;
    }
    
    public abstract Move selectMove(PokemonInterface p);

}
