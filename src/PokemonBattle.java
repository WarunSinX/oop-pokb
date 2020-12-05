/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author super
 */
public class PokemonBattle implements PokemonBattleInterface {
    
    protected TrainerInterface trainer1;
    protected TrainerInterface trainer2;
    private int round;
    
    public PokemonBattle(TrainerInterface t1, TrainerInterface t2) {
        trainer1 = t1;
        trainer2 = t2;
        round = 0;
    }
    
    @Override
    public void battle() throws CheckedNullPointerException {
        if(trainer1 == null || trainer2 == null) {
            throw new CheckedNullPointerException("Trainer cannot be null");
        }
        while(!playOneRound()) {}
    }
    
    
    protected boolean playOneRound() {
        phase1PrintRoundInfo();
        phase2TakeAction();
        phase3DetermineResult();
        return phase4IsBattleOver();
    }
    
    protected void phase1PrintRoundInfo() {
        round++;
        System.out.println();
        System.out.println();
        System.out.println("======================Round "+round+"======================");
        printRoundInfo(trainer1);
        printRoundInfo(trainer2);
    }
    
    protected void printRoundInfo(TrainerInterface t) {
        PokemonInterface c = t.getCurrentPokemon();
        System.out.println(t.getName()+" has "+t.getNumAlivePokemons()+
                " Pokemon and is now using "+c.getName()+" (HP = "+c.getHPStat()+")");
    }
    
    protected void phase2TakeAction() {
        PokemonInterface p1 = trainer1.getCurrentPokemon();
        PokemonInterface p2 = trainer2.getCurrentPokemon();
        TrainerInterface fasterTrainer = trainer2;
        TrainerInterface slowerTrainer = trainer1;
        PokemonInterface fasterPokemon = p2;
        PokemonInterface slowerPokemon = p1;
        
        // p1 also attacks first if p1's speed == p2's speed
        if(p1.getSpeedStat() >= p2.getSpeedStat()) {
            fasterPokemon = p1;
            slowerPokemon = p2;
            fasterTrainer = trainer1;
            slowerTrainer = trainer2;
        }
        
        attack(fasterTrainer, fasterPokemon, slowerTrainer, slowerPokemon);
        
        if(!slowerPokemon.faint()) {
            attack(slowerTrainer, slowerPokemon, fasterTrainer, fasterPokemon);
        }
    }
    
    private void attack(TrainerInterface attackerTrainer, PokemonInterface attacker, TrainerInterface victimTrainer, PokemonInterface victim) {
        System.out.println("----------- "+attackerTrainer.getName()+"'s "+attacker.getName()+"'s attacking turn -----------");
        Move attackerMove = attacker.selectAttackMove(attackerTrainer);
        int damage = victim.takeHit(attacker, attackerMove);
        System.out.println(attackerTrainer.getName()+"'s "+attacker.getName() + " uses "+attackerMove.name+", dealing "+damage+" HP.");
        if(victim.faint()) {
            System.out.println(victimTrainer.getName()+"'s "+victim.getName()+" fainted.");
        } else {
            System.out.println(victimTrainer.getName()+"'s "+victim.getName()+"'s HP: "+victim.getHPStat());
        }
    }
    
    // Set currentPokemon to the new one if the current one is dead
    protected void phase3DetermineResult() {
        determineResult(trainer1);
        determineResult(trainer2);
    }
    
    protected void determineResult(TrainerInterface t) {
        if(t.sendNewPokemon()) {
            PokemonInterface n = t.getCurrentPokemon();
            System.out.println(t.getName()+" is sending a new pokemon: "+n.getName());
        }
    }
    
    // (1) Determine whether the battle is over
    // (2) Print out the name of the winner
    protected boolean phase4IsBattleOver() {
        System.out.println("<<<<<<< Ending Round "+round+" >>>>>>>");
        if(trainer1.isDefeated()) {
            printWinner(trainer2, trainer1);
            return true;
        }
        if(trainer2.isDefeated()) {
            printWinner(trainer1, trainer2);
            return true;
        }
        System.out.println("No winner");
        return false;
    }
    
    private void printWinner(TrainerInterface winner, TrainerInterface loser) {
        System.out.println(loser.getName()+" has no Pokemon left.");
        System.out.println("The winner is "+winner.getName()+"!");
    }
}
