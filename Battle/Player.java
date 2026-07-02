/*
 * Created: 07/01/2026
 * Last Edit: 07/01/2026
 * Creator: Matthew Rivera
 * Description: This class represents a player, it has the data for a players team
 *             of Pokémon. Can be used for human player or bot player
 *
 */

package Battle;

import Pokemon.Pokemon;

public class Player {
    private String name;
    private Pokemon[] pokemon;
    private int totalPokemon, alivePokemon;

    public Player(){
        name = "Unknown";
        pokemon = new Pokemon[6];
        totalPokemon = 6;
        alivePokemon = 6;
    }

    public Player(String name, Pokemon[] pokemon){
        this.name = name;
        this.pokemon = pokemon;
        totalPokemon = pokemon.length;
        alivePokemon = pokemon.length;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getTotalPokemon(){
        return totalPokemon;
    }

    public int getAlivePokemon(){
        return alivePokemon;
    }

    public void changeAlivePokemon(){
        alivePokemon -= 1;
    }
}
