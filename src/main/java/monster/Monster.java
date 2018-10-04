package monster;

//Basic monster implementation.
public class Monster {


    private int monsterId;
    private int averageHitPoints;
    private HitDice hitDice;
    private int challengeRating;
    private String name;

    public Monster() {
        this.monsterId = 3;
        this.averageHitPoints = 195;
        this.hitDice = new HitDice(17, 12);
        this.challengeRating = 14;
        this.name = "Adult Black Dragon";
    }

    public int getAverageHitPoints() {
        return averageHitPoints;
    }

    public void setAverageHitPoints(int averageHitPoints) {
        this.averageHitPoints = averageHitPoints;
    }

    public HitDice getHitDice() {
        return hitDice;
    }

    public void setHitDice(HitDice hitDice) {
        this.hitDice = hitDice;
    }

    public int getChallengeRating() {
        return challengeRating;
    }

    public void setChallengeRating(int challengeRating) {
        this.challengeRating = challengeRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonsterId() { return monsterId; }

    public void setMonsterId(int monsterId) { this.monsterId = monsterId; }
}
