public abstract class AbstractBaseTrainer implements TrainerInterface {
    protected PokemonInterface[] pokemons;
    protected PokemonInterface currentPokemon;
    protected String name;

    public AbstractBaseTrainer(String n,PokemonInterface[] p){
        this.name = n;
        this.pokemons = p;
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
        if(this.currentPokemon.faint() == false || this.isDefeated() ){
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
        for(int i=0; i<=pokemons.length; i++){
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
    public PokemonInterface getPokemon(int i){
        return this.pokemons[i];
    }

    @Override
    public int getNumAlivePokemons(){
        int check=0;
        for(int i=0; i<=pokemons.length; i++){
            if(pokemons[i].faint()==true){
                check++;
            }
        }
        return check;
    }
    
    public abstract Move selectMove(PokemonInterface p){
       
    } 

}
