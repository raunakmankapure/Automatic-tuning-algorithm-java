package com.yourcompany;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutomatedTuningAppTest {

    @Test
    public void testEnginePerformance() {
        Engine engine = new Engine();
        double initialPerformance = engine.simulateEnginePerformance();
        assertTrue(initialPerformance >= 0 && initialPerformance <= 100);
    }

    @Test
    public void testOptimizeParameters() {
        Engine engine = new Engine();
        engine.optimizeParameters();
        assertTrue(engine.getFuelInjectionTiming() >= 0 && engine.getFuelInjectionTiming() <= 10);
        assertTrue(engine.getAirFuelRatio() >= 10 && engine.getAirFuelRatio() <= 15);
        assertTrue(engine.getIgnitionTiming() >= 0 && engine.getIgnitionTiming() <= 20);
    }
}
