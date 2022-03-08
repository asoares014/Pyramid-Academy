package hvg;

import java.util.ArrayList;

public class Human {
    int health;
    int minAttackPower;
    int x_location;
    int y_location;
    ArrayList<Potion> potions = new ArrayList<>();

    Human(){
        health = 100;
        minAttackPower = 15;
        x_location = (int)Math.floor(Math.random() * 10);
        y_location = (int)Math.floor(Math.random() * 10);
    }

    public void move (int x_location, int y_location){
        this.x_location = x_location;
        this.y_location = y_location;
    }

    public void collectPotion (Potion potion){
        potions.add(potion);
        System.out.println("Collect potion!");
        System.out.println("Potion inventory is " + potions.size());
    }

    public boolean consumePotion(){
        if (potions.size() > 0) {
            health += potions.get(0).healingPower;
            System.out.println("The human's health is increased by " + potions.get(0).healingPower);
            System.out.println("Human health: " + this.health);
            potions.remove(0);
            return true;
        } else {
            System.out.println("No potion is available");
            return false;
        }
    }

    @Override
    public String toString(){
        return "\uD83D\uDC68";
    }
}
