package hvg;

import java.util.ArrayList;

public class Land {
    int width = 10;
    int height = 8;
    Human human;
    Goblin goblin;
    ArrayList<Potion> potions;

    Land(Human human, Goblin goblin, ArrayList<Potion> potions){
        this.human = human;
        this.goblin = goblin;
        this.potions = potions;
    }

    @Override
    public String toString(){
        String str = "";
        boolean  isPotion = false;
        for (int i=0; i<height; i++){
            for (int j=0; j<width; j++){
                if (human.x_location == j && human.y_location == i) {
                    str += human.toString();
                    str += "\uD83C\uDF32";
                }else if (goblin.x_location == j && goblin.y_location == i) {
                    str += goblin.toString();
                    str += "\uD83C\uDF32";
                }
                else {
                    for (int k=0; k< potions.size(); k++){
                        if (potions.get(k).x_location == j && potions.get(k).y_location == i){
                            str += potions.get(k).toString();
                            str += "\uD83C\uDF32";
                            isPotion = true;
                        }
                    }
                    if (isPotion)
                        isPotion = false;
                    else
                        str += "\uD83C\uDF32";
                }
            }
            str += "\n";
        }
        return str;
    }
}
