/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familiarity.review.code.ACPModel;

/**
 *
 * @author cobyc
 */
public class Game {
    private String name;
    private String genre;
    private Boolean installed;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Boolean getInstalled() {
        return installed;
    }

    public void setInstalled(Boolean installed) {
        this.installed = installed;
    }
    
    public Game(String name, String genre, Boolean installed)
    {
        this.name = name;
        this.genre = genre;
        this.installed = installed;
    }
}
