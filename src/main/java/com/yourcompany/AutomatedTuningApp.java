package com.yourcompany;

public class AutomatedTuningApp {

    public static void main(String[] args) {
        Engine engine = new Engine();
        TuningAlgorithm algorithm = new TuningAlgorithm();

        algorithm.performAutomatedTuning(engine);
    }
}
