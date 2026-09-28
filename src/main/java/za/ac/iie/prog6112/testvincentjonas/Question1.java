package za.ac.iie.prog6112.testvincentjonas;

import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Question1 {
    public static void main(String[] args) {

        // Sales data for 3 cities and 3 consoles
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "Xbox", "Nintendo Switch"};
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-18s %-10s %-10s %-18s %-10s%n",
                "City", "PS5", "Xbox", "Nintendo Switch", "Total");
        System.out.println("---------------------------------------------------------------------");

        int[] consoleTotals = new int[3];
        
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;
            for (int j = 0; j < consoles.length; j++) {
                cityTotal += sales[i][j];
                consoleTotals[j] += sales[i][j];
            }
            System.out.printf("%-18s %-10d %-10d %-18d %-10d%n",
                    cities[i], sales[i][0], sales[i][1], sales[i][2], cityTotal);
        }

        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-18s %-10d %-10d %-18d %-10d%n",
                "TOTAL", consoleTotals[0], consoleTotals[1], consoleTotals[2], 
                consoleTotals[0] + consoleTotals[1] + consoleTotals[2]);
        System.out.println("---------------------------------------------------------------------");
    }
}