package tennis;

public class TennisGameImpl extends TennisGame {
    
    public TennisGameImpl(String strPlayer1Name, String strPlayer2Name) {
        super(strPlayer1Name, strPlayer2Name);
    }

    void pointWon() {
        try {
        if (HeadJudge.pointWinner() == "player1") m_iScore1 += 1;
        else m_iScore2 += 1;
        } catch (TennisException te) {
            // te.printStackTrace();
        }
    }

    public String getScore() {
        String s = "";
        int i1=0;
        if (m_iScore1 == m_iScore2)
        {
          switch (m_iScore1) {
         case 0: s = "Love-All"; break;
         case 1: s = "Fifteen-All"; break;
           case 2: s = "Thirty-All"; break;
          default: s = "Deuce"; break;
        }
        } else if (m_iScore1 >=4 || m_iScore2 >=4) {
          int iMinusResult = m_iScore1 - m_iScore2;
               if (iMinusResult==1) s ="Advantage player1";
          else if (iMinusResult ==-1) s ="Advantage player2";
          else if (iMinusResult>=2) s = "Win for player1";
        else s ="Win for player2";
        } else {
          for (int i=1; i<3; i++) {
        if (i==1) i1 = m_iScore1;
        else { s+="-"; i1 = m_iScore2;}
          switch(i1) {
            case 0: s+="Love"; break;
            case 1: s+="Fifteen"; break;
            case 2: s+="Thirty"; break;
          case 3: s+="Forty"; break;
           }
          }
        }
        return s;
    }
}
