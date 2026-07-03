/*
 * Created: 07/02/2026
 * Last Edit: 07/02/026
 * Creator: Matthew Rivera
 * Description: Main driver class, which will run the program
 *
 */

import Pokemon.Sub.SubPokemon;
import java.util.Scanner;
import Battle.Player;
import Pokemon.Pokemon;

public class Driver {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Player user = new Player();
        System.out.println("- Hello Trainer, and welcome to the Pokémon Battle Simulator!! (Created by Matthew Rivera)");
        System.out.print("- Before we get started, Please enter your name: ");
        user.setName("\u001b[1m" + in.nextLine() + "\u001b[0m");
        System.out.println("- So," + user.getName() + "'s your name,");
        System.out.println("- Nice to meet you.");
        System.out.println("-\n- Lets start by creating your team!!!");
        System.out.print("- " + user.getName() + ", Please enter the number of pokemon you want in your team: ");
        Pokemon[] userTeam = new Pokemon[checkForInt(in, "- Please use an integer from 1 to 6: ", 1, 6)];
    }

    //TODO make it find the high and low int
    private static int checkForInt(Scanner scanner, String message, int high, int low){
        while(!scanner.hasNextInt()){
            System.out.print(message);
            scanner.next();
        }
        return scanner.nextInt();
    }
}
