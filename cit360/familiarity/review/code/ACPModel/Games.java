/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familiarity.review.code.ACPModel;

import java.util.ArrayList;

/**
 *
 * @author cobyc
 */
public class Games {
    private ArrayList<Game> gamesList;

    public Games()
    {
        gamesList = new ArrayList<>();
        String wow = "World of Warcraft";
        String stardew = "Stardew Valley";
        String rpg = "RPG";
        Boolean yes = true;
        
        gamesList.add(new Game(wow,rpg,yes));
        gamesList.add(new Game(stardew,rpg,yes));
    }
    
    public void addGame(Game game)
    {
        this.gamesList.add(game);
    }
    
    public void print()
    {
        int counter = 0;
        System.out.println("Here are your games:");
        while (counter < gamesList.size())
        {
            Game game = gamesList.get(counter);
            String installation;
            Boolean isInstalled = game.getInstalled();
            if(isInstalled == true)
            {
                installation = "Installed";
            }
            else
            {
                installation = "Not Installed";
            }
            System.out.println(game.getName() + ": " + installation);
            counter++;
        }
        System.out.println("");
    }
}
