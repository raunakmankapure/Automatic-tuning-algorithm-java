package com.yourcompany;

import java.util.Random;

public class Engine {
    private double fuelInjectionTiming;
    private double airFuelRatio;
    private double ignitionTiming;

    public Engine() {

        fuelInjectionTiming = 1.0;
        airFuelRatio = 14.7;
        ignitionTiming = 10.0;
    }

    public void getCurrentParameters() {
        System.out.println("Current Parameters:");
        System.out.println("Fuel Injection Timing: " + fuelInjectionTiming);
        System.out.println("Air-Fuel Ratio: " + airFuelRatio);
        System.out.println("Ignition Timing: " + ignitionTiming);
    }

    public double simulateEnginePerformance() {
        Random rand = new Random();
        double performanceScore = rand.nextDouble() * 100;
        return performanceScore;
    }

    public void optimizeParameters() {
        Random rand = new Random();

        fuelInjectionTiming = rand.nextDouble() * 10;
        airFuelRatio = 10 + rand.nextDouble() * 5;
        ignitionTiming = rand.nextDouble() * 20;

        System.out.println("Parameters optimized!");
    }

    public double getFuelInjectionTiming() {
        return fuelInjectionTiming;
    }

    public void setFuelInjectionTiming(double fuelInjectionTiming) {
        this.fuelInjectionTiming = fuelInjectionTiming;
    }

    public double getAirFuelRatio() {
        return airFuelRatio;
    }

    public void setAirFuelRatio(double airFuelRatio) {
        this.airFuelRatio = airFuelRatio;
    }

    public double getIgnitionTiming() {
        return ignitionTiming;
    }

    public void setIgnitionTiming(double ignitionTiming) {
        this.ignitionTiming = ignitionTiming;
    }
}
