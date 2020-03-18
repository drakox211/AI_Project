package awele.bot.Daisy;

import awele.bot.DemoBot;
import awele.bot.minmax.MaxNode;
import awele.core.Board;
import awele.core.InvalidBotException;

/**
 * @author Alexandre Blansché
 * Bot qui selon le MinMax
 */
public class MinMaxBotDaisy extends DemoBot {
    /**
     * @throws InvalidBotException
     */
    public MinMaxBotDaisy() throws InvalidBotException {
        this.setBotName("MinMax");
        this.addAuthor("Alexandre Blansché");
    }

    /**
     * Rien à faire
     */
    @Override
    public void initialize() {
    }

    /**
     * Pas d'apprentissage
     */
    @Override
    public void learn() {
    }

    /**
     * Sélection du coup selon l'algorithme MinMax
     */
    @Override
    public double[] getDecision(Board board) {
        MinMaxNodeDaisy.initialize(board, 2);
        return new MaxNode(board).getDecision();
    }

    /**
     * Rien à faire
     */
    @Override
    public void finish() {
    }
}
