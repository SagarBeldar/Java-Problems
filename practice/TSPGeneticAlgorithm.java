package practice;

import java.util.*;

public class TSPGeneticAlgorithm {

    private int[][] distanceMatrix;
    private int numberOfCities;
    private int populationSize;
    private int generations;

    public TSPGeneticAlgorithm(int[][] distanceMatrix, int populationSize, int generations) {
        this.distanceMatrix = distanceMatrix;
        this.numberOfCities = distanceMatrix.length;
        this.populationSize = populationSize;
        this.generations = generations;
    }

    public int[] solveTSP() {
        int[][] initialPopulation = generateInitialPopulation();
        int[] bestPath = null;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < generations; i++) {
            int[][] newPopulation = generateNewPopulation(initialPopulation);
            int[] fittestIndividual = getFittestIndividual(newPopulation);
            int currentDistance = calculateDistance(fittestIndividual);

            if (currentDistance < minDistance) {
                minDistance = currentDistance;
                bestPath = fittestIndividual;
            }

            initialPopulation = newPopulation;
        }

        return bestPath;
    }

    private int[][] generateInitialPopulation() {
        int[][] population = new int[populationSize][numberOfCities];
        List<Integer> citiesList = new ArrayList<>();

        for (int i = 0; i < numberOfCities; i++) {
            citiesList.add(i);
        }

        Random random = new Random();

        for (int i = 0; i < populationSize; i++) {
            Collections.shuffle(citiesList);
            for (int j = 0; j < numberOfCities; j++) {
                population[i][j] = citiesList.get(j);
            }
        }

        return population;
    }

    private int[][] generateNewPopulation(int[][] oldPopulation) {
        // Tournament selection, crossover, mutation, etc.
        // This part needs to be implemented based on GA techniques
        return oldPopulation; // Placeholder, actual implementation required
    }

    private int[] getFittestIndividual(int[][] population) {
        int[] fittestIndividual = null;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < population.length; i++) {
            int currentDistance = calculateDistance(population[i]);
            if (currentDistance < minDistance) {
                minDistance = currentDistance;
                fittestIndividual = population[i];
            }
        }

        return fittestIndividual;
    }

    private int calculateDistance(int[] path) {
        int distance = 0;
        for (int i = 0; i < numberOfCities - 1; i++) {
            distance += distanceMatrix[path[i]][path[i + 1]];
        }
        distance += distanceMatrix[path[numberOfCities - 1]][path[0]]; // Return to the starting city
        return distance;
    }

    public static void main(String[] args) {
        int[][] distanceMatrix = {
            {0, 10, 15, 20},
            {10, 0, 35, 25},
            {15, 35, 0, 30},
            {20, 25, 30, 0}
        };
        int populationSize = 50;
        int generations = 1000;

        TSPGeneticAlgorithm tspGA = new TSPGeneticAlgorithm(distanceMatrix, populationSize, generations);
        int[] bestPath = tspGA.solveTSP();

        System.out.println("Best path found: " + Arrays.toString(bestPath));
    }
}

