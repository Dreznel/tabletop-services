package monster;

import java.util.Random;


public class HitDice {

    private int dieAmount;
    private int dieSize;

    public HitDice(int dieAmount, int dieSize) {
        this.dieAmount = dieAmount;
        this.dieSize = dieSize;
    }

    public int rollHp() {
        int hp = 0;
        Random random = new Random();
        for(int i=0; i<this.dieAmount; i++) {
            hp += random.nextInt(this.dieSize) + 1;
        }
        return hp;
    }

    public String toString() {
        return String.format("%dd%d", this.dieAmount, this.dieSize);
    }
}
