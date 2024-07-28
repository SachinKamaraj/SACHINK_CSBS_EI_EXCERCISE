package com.example;

public class SortingContext {
    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void executeSortStrategy(int[] data) {
        sortStrategy.sort(data);
    }
}
