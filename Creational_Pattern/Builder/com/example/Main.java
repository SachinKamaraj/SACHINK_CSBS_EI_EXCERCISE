package com.example;

import com.example.util.LoggingUtility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoggingUtility.log("Starting the Computer Builder application.");
        runUserSession();
        LoggingUtility.log("Exiting the Computer Builder application.");
    }

    public static void runUserSession() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("\nEnter the details for the computer:");

            System.out.print("CPU: ");
            String cpu = scanner.nextLine();

            System.out.print("RAM: ");
            String ram = scanner.nextLine();

            ComputerBuilder builder = new ComputerBuilder(cpu, ram);

            System.out.print("Storage (optional): ");
            String storage = scanner.nextLine();
            if (!storage.isEmpty()) {
                builder.setStorage(storage);
            }

            System.out.print("Graphics Card (optional): ");
            String graphicsCard = scanner.nextLine();
            if (!graphicsCard.isEmpty()) {
                builder.setGraphicsCard(graphicsCard);
            }

            System.out.print("Power Supply (optional): ");
            String powerSupply = scanner.nextLine();
            if (!powerSupply.isEmpty()) {
                builder.setPowerSupply(powerSupply);
            }

            System.out.print("Cooling System (optional): ");
            String coolingSystem = scanner.nextLine();
            if (!coolingSystem.isEmpty()) {
                builder.setCoolingSystem(coolingSystem);
            }

            Computer computer = builder.build();
            LoggingUtility.log("Computer created: " + computer);

        } catch (Exception e) {
            LoggingUtility.log("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

