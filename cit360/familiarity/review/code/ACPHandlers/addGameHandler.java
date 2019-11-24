/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familiarity.review.code.ACPHandlers;

import familiarity.review.code.ACPModel.Game;
import familiarity.review.code.ACPModel.Games;
import familiarity.review.code.ACPMain.Main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author cobyc
 */
public class addGameHandler implements Handler {
    public addGameHandler()
    {
        
    }
    @Override
    public Object handleIt(HashMap<String, Object> data)
    {
        Scanner scanner = new Scanner(System.in);
        Games gamesList = (Games)data.get("Games");
        
        System.out.println("Please input the name of the new game: ");
        String name = scanner.nextLine();
        
        System.out.println("What is the genre of the new game?");
        String genre = scanner.nextLine();
        
        System.out.println("Is this game already installed? y/n");
        char isInstalled = scanner.next().charAt(0);
        Boolean installed;
        if (isInstalled == 'y')
        {
            installed = true;
        }
        else
        {
            installed = false;
        }
        System.out.println(installed);
        Game newGame = new Game(name, genre, installed);
        gamesList.addGame(newGame);
        System.out.println("Your game has been added to your library.");
        System.out.println("");
        return null;
        
    }
}
