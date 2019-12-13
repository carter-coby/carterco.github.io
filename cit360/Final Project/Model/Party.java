/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject.Model;

import java.util.ArrayList;

public class Party {
    private ArrayList<Pokemon> partyPokemon;
    
    public Party()
    {
        partyPokemon = new ArrayList<>();
    }
    
    public void addPokemon(Pokemon pokemon)
    {
        this.partyPokemon.add(pokemon);
    }
    
    public void removePokemon(int pokemonNumber)
    {
        this.partyPokemon.remove(pokemonNumber);
    }
    
    public void print()
    {
        int counter = 0;
        System.out.println("These are all the pokemon currently in your party:");
        System.out.println("");
        while (counter < partyPokemon.size())
        {
            Pokemon pokemon = partyPokemon.get(counter);
            System.out.println(pokemon.getName());
            System.out.println("Type(s): " + pokemon.getTypes());
            counter++;
            System.out.println("Moves:");
            ArrayList<String> pokemonmoves = pokemon.getMoves();
            int count = 0;
            while (count < pokemonmoves.size())
            {
                System.out.println("\t" + pokemonmoves.get(count));
                count++;
            }
            System.out.println("");
        }
    }
    
    public ArrayList<Pokemon> getPartyPokemon()
    {
        return partyPokemon;
    }
}
