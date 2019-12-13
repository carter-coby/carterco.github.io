/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject.Control;

import FinalProject.Model.Pokemon;
import FinalProject.Model.Party;
import FinalProject.PokemonHandler;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;
import java.net.URL;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.ProtocolException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
/**
 *
 * @author cobyc
 */
public class addPokemonHandler implements PokemonHandler{
    public addPokemonHandler()
    {
        
    }
    
    public class GetMove implements Callable{
        private final ArrayList moveset;
        
        public GetMove(ArrayList moveset)
        {
            this.moveset = moveset;
        }
        
        @Override
        public Object call() throws Exception {
            int max = moveset.size();
            int randomnum = ThreadLocalRandom.current().nextInt(0, max);
            LinkedTreeMap move = (LinkedTreeMap) moveset.get(randomnum);
            JsonObject obj = new Gson().toJsonTree(move).getAsJsonObject();
            JsonObject obj2 = (JsonObject) obj.get("move");
            JsonElement movename = obj2.get("name");
            String pokemonMove = movename.toString();
            pokemonMove = pokemonMove.replace("\"", "");
            return pokemonMove;
        }
    }
    
    @Override
    public Object handleIt(HashMap<String, Object> data)
    {
        Party partyPokemon = (Party)data.get("Party");
        ArrayList partySize = partyPokemon.getPartyPokemon();
        if (partySize.size() > 5)
        {
            System.out.println("");
            System.out.println("You can only have 6 Pokemon in your party.");
            System.out.println("Please remove at least 1 Pokemon before adding another.");
            System.out.println("");
        }
        else
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Which Pokemon do you want to add to the party?");
            String pokemonName = scanner.nextLine();
            System.out.println("Pulling Pokemon information...");
            pokemonName = pokemonName.toLowerCase();
            URL pokemonUrl = null;
            try {
                pokemonUrl = new URL("https://pokeapi.co/api/v2/pokemon/" + pokemonName + "/");
            } catch (MalformedURLException ex) {
                Logger.getLogger(addPokemonHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
            HttpURLConnection connection = null;
            try {
                connection = (HttpURLConnection) pokemonUrl.openConnection();
            } catch (IOException ex) {
                Logger.getLogger(addPokemonHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                connection.setRequestMethod("GET");
            } catch (ProtocolException ex) {
                Logger.getLogger(addPokemonHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/28.0.1500.29 Safari/537.36");
            BufferedReader in = null;
            try {
                in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            } catch (IOException ex) {
                Logger.getLogger(addPokemonHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            try {
                while ((inputLine = in.readLine()) != null)
                {
                    response.append(inputLine);
                }
            } catch (IOException ex) {
                Logger.getLogger(addPokemonHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(addPokemonHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
            Gson gson = new Gson();
            JSONObject json = new Gson().fromJson(response.toString(), JSONObject.class);
            ArrayList<LinkedTreeMap> moves = (ArrayList) json.get("moves");
            ArrayList<LinkedTreeMap> types = (ArrayList) json.get("types");
            Callable<String> callable = new GetMove(moves);
            ExecutorService exec = Executors.newFixedThreadPool(4);
            Future<String> future1 = exec.submit(callable);
            Future<String> future2 = exec.submit(callable);
            Future<String> future3 = exec.submit(callable);
            Future<String> future4 = exec.submit(callable);
            String move1 = null;
            String move2 = null;
            String move3 = null;
            String move4 = null;
            try {
                move1 = future1.get();
            } catch (InterruptedException ex) {
                Logger.getLogger(addPokemonHandler.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(addPokemonHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                move2 = future2.get();
            } catch (InterruptedException ex) {
                Logger.getLogger(addPokemonHandler.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(addPokemonHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                move3 = future3.get();
            } catch (InterruptedException ex) {
                Logger.getLogger(addPokemonHandler.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(addPokemonHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                move4 = future4.get();
            } catch (InterruptedException ex) {
                Logger.getLogger(addPokemonHandler.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(addPokemonHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
            exec.shutdown();
            ArrayList<String> pokemonMoveset = new ArrayList();
            pokemonMoveset.add(move1);
            pokemonMoveset.add(move2);
            pokemonMoveset.add(move3);
            pokemonMoveset.add(move4);

            ArrayList<String> typeList = new ArrayList();
            int typecounter = 0;
            while (typecounter < types.size())
            {
                LinkedTreeMap typesList = (LinkedTreeMap) types.get(typecounter);
                LinkedTreeMap type = (LinkedTreeMap) typesList.get("type");
                String typeName = (String) type.get("name");
                typeList.add(typeName);
                typecounter++;
            }
            pokemonName = pokemonName.substring(0,1).toUpperCase() + pokemonName.substring(1).toLowerCase();
            Pokemon newPokemon = new Pokemon(pokemonName, typeList, pokemonMoveset);
            partyPokemon.addPokemon(newPokemon);
            System.out.println(pokemonName + " has been added to your party!");
            System.out.println("");
        }
        return null;
    } 
}
