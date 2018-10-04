package monster;

import dice.Dice;
import dice.FairDice;

public class HitDice {

    private int dieAmount;
    private int dieSize;

    public HitDice(int dieAmount, int dieSize) {
        this.dieAmount = dieAmount;
        this.dieSize = dieSize;
    }

    public int rollHp(Dice die) {
        int hp = 0;
        for(int i=0; i<this.dieAmount; i++) {
            hp += die.roll();
        }
        return hp;
    }

    public int rollHp() {
        return this.rollHp(new FairDice(this.dieSize));
    }

    public String toString() {
        return String.format("%dd%d", this.dieAmount, this.dieSize);
    }

    public int getDieAmount() {
        return dieAmount;
    }

    public void setDieAmount(int dieAmount) {
        this.dieAmount = dieAmount;
    }

    public int getDieSize() {
        return dieSize;
    }

    public void setDieSize(int dieSize) {
        this.dieSize = dieSize;
    }
}
