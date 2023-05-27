public class Player {
    private static int totalScore;
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        this.score += score;
        totalScore += score;
    }

    public static int getTotalScore() {
        return totalScore;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "name= " + name + ", Score= " + score;
    }
}
