package hvg;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Human human = new Human();
    static Goblin goblin = new Goblin();
    static ArrayList<Potion> potions = new ArrayList<>();
    static Land land = new Land(human, goblin, potions);

    static boolean gameOver = false;

    public static void main(String[] args) {
        System.out.println("Welcome to the Human vs Goblin! Your character is the human and the goblin will be chasing you!");
        System.out.println("When you collide with the goblin, you will enter in combat");
        System.out.println("Don't worry, you can fight back with the help of a healing potion");
        System.out.println("Move to " + "\uD83C\uDF76" + " to collect potions");
        System.out.println("Move next to " + "\uD83D\uDC7A" + " to initiate combat");
        System.out.println("Now, fight!");

        while(!gameOver) {
            if ((int)Math.round(Math.random() * 3) == 1) {
                potions.add(new Potion());
                System.out.println("Potion drop!");
            }
            System.out.println(land);

            while(!moveHuman()) {
                if(!hasCollision()){
                    goblin.move(human);
                }
            }
        }

    }

    public static boolean hasCollision() {
        int xDistance = goblin.x_location - human.x_location;
        int yDistance = goblin.y_location - human.y_location;
        if (Math.abs(xDistance) == 1 && Math.abs(yDistance) == 0) {
            fight();
            return true;
        } else if(Math.abs(xDistance) == 0 && Math.abs(yDistance) == 1) {
            fight();
            return true;
        }
        else return false;
    }

    public static void fight() {
        int goblinDamage = (int) (Math.random() * 10) + human.minAttackPower;
        int humanDamage = (int) (Math.random() * 10) + goblin.minAttackPower;
        goblin.health -= goblinDamage;
        human.health -= humanDamage;
        if(goblin.health <= 0){
            System.out.println("Human did " + goblinDamage + " damage to goblin. The goblin is dead, game over!");
            gameOver = true;
        }
        if(human.health <= 0) {
            System.out.println("Goblin did " + humanDamage + " damage to the human. The human is dead, game over!");
            gameOver = true;
        }
        else {
            System.out.println("Human attack: " + goblinDamage + " damages! Goblin's health: " + goblin.health);
            System.out.println("Goblin attack: " + humanDamage + " damages! Human's health: " + human.health);
        }
    }

    public static boolean moveHuman(){
        System.out.println("Make your move.");
        System.out.println("Enter ('n' / 's' / 'e' / 'w') to move.");
        System.out.println("Enter 'a' to continue attacking.");
        System.out.println("Enter 'p' to drink potion");
        Scanner scanner = new Scanner(System.in);
        char action = scanner.next().charAt(0);
        switch(action) {
            case 'n':
                if (goblin.y_location - human.y_location == -1 && goblin.x_location == human.x_location)
                    return false;
                human.move(human.x_location, human.y_location - 1);
                isFoundPotion();
                return true;
            case 's':
                if(goblin.y_location - human.y_location == 1 && goblin.x_location == human.x_location)
                    return false;
                human.move(human.x_location, human.y_location + 1);
                isFoundPotion();
                return true;
            case 'e':
                if(goblin.x_location - human.x_location == 1 && goblin.y_location == human.y_location)
                    return false;
                human.move(human.x_location + 1, human.y_location);
                isFoundPotion();
                return true;
            case 'w':
                if(goblin.x_location - human.x_location == -1 && goblin.y_location == human.y_location)
                    return false;
                human.move(human.x_location - 1, human.y_location);
                isFoundPotion();
                return true;
            case 'p':
                human.consumePotion();
                return false;
            case 'a':
                return true;
        }
        return false;
    }

    public static void isFoundPotion(){
        for(int i = 0; i <potions.size(); i++){
            if(human.x_location == potions.get(i).x_location && human.y_location == potions.get(i).y_location) {
                human.collectPotion(potions.remove(i));
                break;
            }
        }
    }
}
