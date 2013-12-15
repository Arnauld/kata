package tennis;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class HeadJudge {
    private static String player;

    public static void playerWon(String strPlayerName) {
        HeadJudge.player = strPlayerName;
        TennisGame.getInstance().pointWon();
        HeadJudge.player = null;
    }

    private static TennisException TENNIS_EXCEPTION = new TennisException();

    public static String pointWinner() throws TennisException {
        // http://kaihon.blogspot.fr/2011/01/reusing-exceptions.html
        if(player == null)
            throw TENNIS_EXCEPTION;
        return player;
    }

}
