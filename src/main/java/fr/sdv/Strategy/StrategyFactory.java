package fr.sdv.Strategy;

import fr.sdv.Strategy.AlgoTri.Bubble;
import fr.sdv.Strategy.AlgoTri.Insertion;
import fr.sdv.Strategy.AlgoTri.Selection;


public class StrategyFactory {

    public strategy getStrategy(Type typeTri) {
        switch (typeTri) {
            case BUBBLE:
                return new Bubble();
            case INSERTION:
                return new Insertion();
            case SELECTION:
                return new Selection();
            default:
                return null;
        }
    }

}
