package awele.bot.Daisy;

import awele.bot.CompetitorBot;
import awele.bot.minmax.MaxNode;
import awele.bot.minmax.MinMaxNode;
import awele.core.Board;
import awele.core.InvalidBotException;

public class Daisy extends CompetitorBot {

    public Daisy() throws InvalidBotException {
        addAuthor("Arnaud GARRIGUE & Julian ROUSSEL");
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
        MinMaxNode.initialize (board, 5);
        return new MaxNode(board).getDecision ();
    }

    @Override
    public void learn() {

    }
}
