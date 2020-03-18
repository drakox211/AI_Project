package awele.bot.Daisy;

import awele.core.Board;

/**
 * @author Alexandre Blansché
 * Noeud Min : estimation du meilleur coup possible pour l'adversaire
 */
public class MinNodeDaisy extends MinMaxNodeDaisy
{
    /**
     * Constructeur pour un noeud initial
     * @param board La situation de jeu pour laquelle il faut prendre une décision
     */
    MinNodeDaisy(Board board)
    {
        this (board, 0, -Double.MAX_VALUE, Double.MAX_VALUE);
    }

    /**
     * Constructeur d'un noeud interne
     * @param board L'état de la grille de jeu
     * @param depth La profondeur du noeud
     * @param alpha Le seuil pour la coupe alpha
     * @param beta Le seuil pour la coupe beta
     */
    MinNodeDaisy(Board board, int depth, double alpha, double beta)
    {
        super (board, depth, alpha, beta);
    }

    /**
     * Retourne le min
     * @param eval1 Un double
     * @param eval2 Un autre double
     * @return Le min entre deux valeurs, selon le type de noeud
     */
    @Override
    protected double minmax (double eval1, double eval2)
    {
        return Math.min (eval1, eval2);
    }

    /**
     * Indique s'il faut faire une coupe alpha-beta
     * (si l'évaluation courante du noeud est inférieure à l'évaluation courante du noeud parent)
     * @param eval L'évaluation courante du noeud
     * @param alpha Le seuil pour la coupe alpha
     * @param beta Le seuil pour la coupe beta
     * @return Un booléen qui indique s'il faut faire une coupe alpha-beta
     */
    @Override
    protected boolean alphabeta (double eval, double alpha, double beta)
    {
        return eval <= alpha;
    }

    /**
     * Retourne un noeud MaxNode du niveau suivant
     * @param board L'état de la grille de jeu
     * @param depth La profondeur du noeud
     * @param alpha Le seuil pour la coupe alpha
     * @param beta Le seuil pour la coupe beta
     * @return Un noeud MaxNode du niveau suivant
     */
    @Override
    protected MinMaxNodeDaisy getNextNode (Board board, int depth, double alpha, double beta)
    {
        return new MaxNodeDaisy(board, depth, alpha, beta);
    }

    /**
     * Mise à jour de alpha
     * @param evaluation L'évaluation courante du noeud
     * @param alpha L'ancienne valeur d'alpha
     * @return
     */
    @Override
    protected double alpha (double evaluation, double alpha)
    {
        return alpha;
    }

    /**
     * Mise à jour de beta
     * @param evaluation L'évaluation courante du noeud
     * @param beta L'ancienne valeur de beta
     * @return
     */
    @Override
    protected double beta (double evaluation, double beta)
    {
        return Math.min (evaluation, beta);
    }

    /** Pire score : une grande valeur */
    @Override
    protected double worst ()
    {
        return Double.MAX_VALUE;
    }
}
