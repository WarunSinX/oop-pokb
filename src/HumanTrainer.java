import java.util.Scanner;

public class HumanTrainer extends AbstractBaseTrainer{
    protected Scanner input = new Scanner(System.in);

    public HumanTrainer(String name, PokemonInterface[] pokemons, Scanner input){
        super(name, pokemons);
        this.input = input;
    }
    
	public Move selectMove(PokemonInterface p) {
        System.out.print("What move do you want to select: " + p.movesToString());
        int numSelected = input.nextInt();
		return ((Move) p.getMove(numSelected));
    }

    public static void main(String[] args){
        PokemonInterface mine = Utility.ALL_POKEMONS[1];
        System.out.println(mine.movesToString());
    }
}
