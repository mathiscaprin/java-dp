package fr.sdv.Strategy;

public class Tri {

    public void exec(Type typeTri, Integer[] arr) {

        StrategyFactory strategyFactory = new StrategyFactory();
        strategy strategy = strategyFactory.getStrategy(typeTri);
        strategy.trier(arr);
    }
}
