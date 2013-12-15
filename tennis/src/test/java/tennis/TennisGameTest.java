package tennis;

import org.junit.Test;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class TennisGameTest {

    @Test
    public void game() {
        TennisGame game = new TennisGameImpl("Nadal", "Gasquet");
        HeadJudge.playerWon("Gasquet");
        System.out.println(game.getScore());
        HeadJudge.playerWon("Gasquet");
        System.out.println(game.getScore());
        HeadJudge.playerWon("Gasquet");
        System.out.println(game.getScore());
    }
}
