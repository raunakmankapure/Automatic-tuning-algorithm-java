package com.yourcompany;

public class TuningAlgorithm {

    public void performAutomatedTuning(Engine engine) {
        System.out.println("Initial Parameters:");
        engine.getCurrentParameters();

        double initialPerformance = engine.simulateEnginePerformance();
        System.out.println("Initial Performance: " + initialPerformance);

        engine.optimizeParameters();

        System.out.println("Optimized Parameters:");
        engine.getCurrentParameters();

        double optimizedPerformance = engine.simulateEnginePerformance();
        System.out.println("Optimized Performance: " + optimizedPerformance);
    }

    public static void main(String[] args) {
        Engine engine = new Engine();
        TuningAlgorithm algorithm = new TuningAlgorithm();

        algorithm.performAutomatedTuning(engine);
    }
}
