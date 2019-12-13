/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject.Control;

import FinalProject.Model.Pokemon;
import FinalProject.Model.Party;
import FinalProject.PokemonHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author cobyc
 */
public class removePokemonHandler implements PokemonHandler {
    @Override
    public Object handleIt(HashMap<String, Object> data)
    {
        Party partyPokemon = (Party)data.get("Party");
        ArrayList partySize = partyPokemon.getPartyPokemon();
        if (partySize.size() <= 0)
        {
            System.out.println("You have no pokemon in your party to remove!");
        }
        else
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("");
            System.out.println("Please select the pokemon you wish to remove from your party:");
            int counter = 0;
            while (counter < partySize.size())
            {
                Pokemon pokemon = (Pokemon) partySize.get(counter);
                System.out.println(counter + ".) " + pokemon.getName());
                counter++;
            }
            int choice = scanner.nextInt();
            System.out.println("Removing the Pokemon from your party...");
            partyPokemon.removePokemon(choice);
            System.out.println("Pokemon removed!");
            System.out.println("");
        }
        return null;
    }
    
}
