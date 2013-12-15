package tennis;

public abstract class TennisGame {

    protected static TennisGame instance;

    public static TennisGame getInstance() {
        return instance;
    }

    protected int m_iScore1 = 0;
    protected int m_iScore2 = 0;
    private String strPlayer1Name;
    private String strPlayer2Name;

    public TennisGame(String strPlayer1Name, String strPlayer2Name) {
        instance = this;
        this.strPlayer1Name = strPlayer1Name;
        this.strPlayer2Name = strPlayer2Name;
    }


    abstract void pointWon();

    public abstract String getScore();
}