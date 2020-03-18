package awele.bot.Daisy;

import awele.bot.CompetitorBot;
import awele.core.Board;
import awele.core.InvalidBotException;

public class Daisy extends CompetitorBot {

    public Daisy() throws InvalidBotException {
        addAuthor("Arnaud GARRIGUE");
        addAuthor("Julian ROUSSEL");
        setBotName("Daisy");
    }

    @Override
    public void initialize() {

    }

    @Override
    public void finish() {

    }

    @Override
    public double[] getDecision(Board board) {
        MinMaxNodeDaisy.initialize (board, 5);
        return new MaxNodeDaisy(board).getDecision ();
    }

    @Override
    public void learn() {

    }
}
