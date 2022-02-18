import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DragonCave dragon = new DragonCave();
        System.out.println(dragon.intro());
        Scanner input = new Scanner(System.in);

        try {
            int user = input.nextInt();
            if (user == 1) {
                System.out.println(dragon.dragonEatsYou());
            } else if (user == 2) {
                System.out.println(dragon.dragonSharesTreasure());
            } else {
                System.out.println(dragon.dragonIncorrectEntry());
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Input has to be 1 or 2");
        }
    }
    }
