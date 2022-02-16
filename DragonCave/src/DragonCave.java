import java.util.Scanner;

public class DragonCave {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see ywo caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? ( 1 or 2)");

        try {
            int user = input.nextInt();
            if (user == 1) {
                System.out.println("You approach the cave...");
                System.out.println("It is dark and spooky...");
                System.out.println("A large dragon jumps out in front of you. He opens his jaws and...");
                System.out.println("Gobbles you down in one bite");
            } else if (user == 2) {
                System.out.println("You approach the cave...");
                System.out.println("It is bright and sparkly...");
                System.out.println("A friendly dragon jumps out and invites you closer and...");
                System.out.println("Shares some of his treasure with you.");
            } else {
                System.out.println("Incorrect entry. YOU SHALL NOT PASS!");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Input has to be 1 or 2");
        }
    }
}
