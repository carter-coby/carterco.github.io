/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.util.*;
/**
 *
 * @author cobyc
 */
public class runHibernate {
    public static void main(String[] args)
    {
        databaseInstance di = databaseInstance.getInstance();
        
        List<Actor> actors = di.getActors();
        for(Actor i : actors)
        {
            System.out.println(i);
        }
        
        System.out.println(di.getActor(1));
        
        di.closeSession();
    }
}
