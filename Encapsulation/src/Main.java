/**
 * Created by nana1 on 6/30/2017.
 */

// encapsulation is the mechanism that allows to restrict certain components of the object
// to protect the members of the data and validation
public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaining health = "+ player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("remaining health = "+ player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("tim", 50, "Sword");
        System.out.println("Initial health is "+ player.getHealth());
    }
}
