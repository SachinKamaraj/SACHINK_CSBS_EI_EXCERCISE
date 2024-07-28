package com.example;

public class Main {
    public static void main(String[] args) {
        SortingContext context = new SortingContext();

        int[] data1 = {5, 2, 9, 1, 5, 6};
        int[] data2 = {3, 8, 7, 5, 2, 1, 9, 5, 4};

        context.setSortStrategy(new BubbleSort());
        System.out.println("Using Bubble Sort:");
        context.executeSortStrategy(data1);

        context.setSortStrategy(new QuickSort());
        System.out.println("Using Quick Sort:");
        context.executeSortStrategy(data2);
    }
}
