/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject.Model;

import java.util.ArrayList;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cobyc
 */
public class PartyTest {
    
    public ArrayList types = new ArrayList();
    public ArrayList moves = new ArrayList();
    public Pokemon pikachu = new Pokemon("Pikachu", types, moves);
    private void buildPokemon()
    {
        types.add("electric");
        moves.add("protect");
        moves.add("rock slide");
        moves.add("thunderbolt");
        moves.add("thunder wave");
    }
    public PartyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddPokemon() {
        System.out.println("ADDPOKEMON TEST");
        System.out.println("Testing that Pokemon are added correctly");
        Pokemon pokemon = pikachu;
        Party instance = new Party();
        instance.addPokemon(pokemon);
        
        System.out.println("Testing to make sure there is a pokemon in the party");
        assertNotNull(instance);
        
        System.out.println("Checking that the pokemon that we created was added properly");
        Assert.assertEquals("Testing name", pokemon.getName(), "Pikachu");
    }

    /**
     * Test of removePokemon method, of class Party.
     */
    @Test
    public void testRemovePokemon() {
        System.out.println("REMOVEPOKEMON TEST");
        System.out.println("Checking if Pokemon are correctly removed");
        int pokemonNumber = 0;
        Party instance = new Party();
        instance.addPokemon(pikachu);
        instance.removePokemon(pokemonNumber);
        
        System.out.println("Checking to make sure that the pokemon was removed");
        Assert.assertNotSame(pikachu, this);
    }

    /**
     * Test of getPartyPokemon method, of class Party.
     */
    @Test
    public void testGetPartyPokemon() {
        System.out.println("GETPARTYPOKEMON TEST");
        System.out.println("Adding pokemon to a party and then checking to make sure get doesn't return null");
        Party instance = new Party();
        instance.addPokemon(pikachu);
        ArrayList<Pokemon> expResult = null;
        ArrayList<Pokemon> result = instance.getPartyPokemon();
        assertNotEquals(expResult, result);
    }
    
}
