/**
 * Created by nana1 on 6/30/2017.
 */
public class EnhancedPlayer {
    private String name;
    private int health = 100; // set default value
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            //reduce number of lives remaining for player
        }
    }

    public int getHealth() {
        return health;
    }
}
