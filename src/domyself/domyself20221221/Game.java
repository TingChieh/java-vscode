package domyself.domyself20221221;

public class Game {
    private int score;
    public int getScore()
    {
        return score;
    }
    public void setScore(int score) {
        if (score < 0) {
            System.out.println("Error");
            return;
        }
        this.score = score;
    }
}
