/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject.View;

import FinalProject.Model.Party;
import FinalProject.PokemonHandler;
import java.util.HashMap;
/**
 *
 * @author cobyc
 */
public class viewPartyHandler implements PokemonHandler{
    @Override
    public Object handleIt(HashMap<String, Object>data)
    {
        Party pokemonParty = (Party)data.get("Party");
        pokemonParty.print();
        return null;
    }
}
