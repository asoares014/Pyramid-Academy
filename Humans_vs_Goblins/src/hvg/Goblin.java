package hvg;

public class Goblin {
    int health;
    int minAttackPower;
    int x_location;
    int y_location;

    Goblin() {
        health = 100;
        minAttackPower = 20;
        x_location = (int)Math.floor(Math.random() * 10);
        y_location = (int)Math.floor(Math.random() * 8);
    }

    //goblin chase human
    public void move (Human human) {
        int xDistance = x_location - human.x_location;
        int yDistance = y_location - human.y_location;
        if(Math.abs(xDistance) == 1 && Math.abs(yDistance) == 1)
            return;
        else if (xDistance > 1)
            x_location--;
        else if(xDistance < -1)
            x_location++;
        else if (yDistance > 1)
            y_location--;
        else if(yDistance < -1)
            y_location++;
    }

    @Override
    public String toString() {
        return "\uD83D\uDC7A";
    }
}
