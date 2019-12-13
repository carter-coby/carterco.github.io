/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import FinalProject.Control.PokemonPartyController;
import FinalProject.Model.Party;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author cobyc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PokemonPartyController controller = new PokemonPartyController();
        Scanner scanner = new Scanner(System.in);
        Party pokemonParty = new Party();
        int choice = -1;
        while (choice != 4)
        {
            choice = (int)controller.selectOption("displayMenu",GetChoice("scanner",scanner));
            switch(choice)
            {
                case 1: controller.selectOption("viewParty",GetChoice("Party",pokemonParty));
                break;
                case 2: HashMap<String, Object>choiceInfo = GetChoice("scanner",scanner);
                choiceInfo.put("Party", pokemonParty);
                controller.selectOption("addPokemon", choiceInfo);
                break;
                case 3: choiceInfo = GetChoice("scanner",scanner);
                choiceInfo.put("Party", pokemonParty);
                controller.selectOption("removePokemon", choiceInfo);
                break;
                case 4: System.out.println("Now exiting...");
                break;
                default: System.out.println("Not a valid selection. Try again.");
                break;
            }
        }
        scanner.close();
    }
    public static HashMap<String, Object> GetChoice(String key, Object value) {
	HashMap<String, Object> data = new HashMap<String, Object>();
	data.put(key, value);
	return data;
    }
}
