/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject.Control;

import FinalProject.PokemonHandler;
import FinalProject.View.viewPartyHandler;
import FinalProject.View.displayMenuHandler;
import java.util.HashMap;
/**
 *
 * @author cobyc
 */
public class PokemonPartyController {
    private HashMap<String, PokemonHandler> options;
    
    public PokemonPartyController()
    {
        options = new HashMap<String, PokemonHandler>();
        options.put("addPokemon", new addPokemonHandler());
        options.put("viewParty", new viewPartyHandler());
        options.put("displayMenu", new displayMenuHandler());
        options.put("removePokemon", new removePokemonHandler());
    }
    
    public Object selectOption(String option, HashMap<String, Object> optionData)
    {
        PokemonHandler action = options.getOrDefault(option, null);
        return action.handleIt(optionData);
    }
}
