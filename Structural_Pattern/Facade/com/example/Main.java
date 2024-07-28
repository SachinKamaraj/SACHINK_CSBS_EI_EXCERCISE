package com.example;

import com.example.util.LoggingUtility;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SurroundSoundSystem soundSystem = new SurroundSoundSystem();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, lights);

        showMenu();
        int choice = getUserChoice(scanner);
        handleUserChoice(choice, homeTheater, scanner);
    }

    private static void showMenu() {
        System.out.println("\nHome Theater System");
        System.out.println("1. Watch Movie");
        System.out.println("2. End Movie");
        System.out.println("Enter your choice: ");
    }

    private static int getUserChoice(Scanner scanner) {
        int choice = -1;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            LoggingUtility.log("Invalid input. Please enter a number.");
        }
        return choice;
    }

    private static void handleUserChoice(int choice, HomeTheaterFacade homeTheater, Scanner scanner) {
        switch (choice) {
            case 1:
                LoggingUtility.log("User selected: Watch Movie");
                System.out.print("Enter movie name: ");
                String movie = scanner.nextLine();
                homeTheater.watchMovie(movie);
                LoggingUtility.log("Movie started: " + movie);
                break;
            case 2:
                LoggingUtility.log("User selected: End Movie");
                homeTheater.endMovie();
                LoggingUtility.log("Movie ended.");
                break;
            default:
                LoggingUtility.log("Invalid choice made by user.");
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
