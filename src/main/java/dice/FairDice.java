package dice;

import java.util.Random;

public class FairDice implements Dice {
    private int sides;

    public FairDice() {
        this.sides = 6;
    }

    public FairDice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        Random random = new Random();
        return random.nextInt(this.sides) + 1;
    }
}
