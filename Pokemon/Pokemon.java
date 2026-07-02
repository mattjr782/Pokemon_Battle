package Pokemon;

/*
 * Created: 07/01/2026
 * Last Edit: 07/01/2026
 * Creator: Matthew Rivera
 * Description: Standard class for Pokémon. holds name level, hp, type, and attacks
 *
 */

/*
    Types and corresponding int
    Normal    :  0
    Fighting  :  1
    Flying    :  2
    Poison    :  3
    Ground    :  4
    Rock      :  5
    Bug       :  6
    Ghost     :  7
    Steel     :  8
    Fire      :  9
    Water     :  10
    Electric  :  11
    Grass     :  12
    Ice       :  13
    Psychic   :  14
 */

public class Pokemon {
    private String name;
    private int level, totalHP, maxHP, type;
    boolean alive;
    private Attack[] attacks;

    //shows what each Pokémon is strong against.
    //if index is -1, Pokémon not strong against anything.
    private final int[][] STRONG_AGAINST = {
            {-1},
            {0, 5, 8, 13},
            {1, 6, 12},
            {12},
            {3, 5,8, 9, 11},
            {9},
            {14, 12},
            {7},
            {5, 13},
            {6, 8, 12, 13},
            {4, 5, 9},
            {2, 10},
            {4, 5, 10},
            {2, 4, 12},
            {1, 3},
    };

    public Pokemon(){}

    public Pokemon(String name, int level, int totalHP, int maxHP, int type, Attack[] attacks){
        this.name = name;
        this.level = level;
        this.totalHP = totalHP;
        this.maxHP = maxHP;
        this.type = type;
        alive = true;
        this.attacks = attacks;
    }

    public String getName(){
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getTotalHP() {
        return totalHP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getType() {
        return type;
    }

    public boolean isAlive() {
        return alive;
    }

    public Attack[] getAttacks() {
        return attacks;
    }

    public void adjustHP(int change){
        totalHP += change;
        if(totalHP > maxHP) totalHP = maxHP;
        if(totalHP < 0){
            totalHP = 0;
            alive = false;
        }
    }
}
