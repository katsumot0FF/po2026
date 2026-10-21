package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {

    public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("Błąd: Podaj dokładnie 6 liczb (od 1 do 49) jako argumenty wywołania.");
            return;
        }

        ArrayList<Integer> userPicks = new ArrayList<>();
        try {
            for (String arg : args) {
                userPicks.add(Integer.parseInt(arg));
            }
        } catch (NumberFormatException e) {
            System.out.println("Błąd: Argumenty muszą być liczbami całkowitymi.");
            return;
        }

        ArrayList<Integer> drawnNumbers = drawNumbers();
        System.out.println("Twoje typy: " + userPicks);
        System.out.println("Wylosowane liczby: " + drawnNumbers);

        int hits = countHits(userPicks, drawnNumbers);
        System.out.println("Liczba trafień: " + hits);

        System.out.println("--------------------------------------------------");

        System.out.println("Rozpoczynam symulację pełnego trafienia (to może chwilę potrwać)...");

        long startTime = System.currentTimeMillis();
        long drawsCount = 0;

        while (true) {
            drawsCount++;
            ArrayList<Integer> currentDraw = drawNumbers();

            if (countHits(userPicks, currentDraw) == 6) {
                break;
            }
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("Liczba losowań potrzebnych do pełnego trafienia: " + drawsCount);
        System.out.println("Łączny czas działania programu: " + totalTime + " ms");
    }


    private static ArrayList<Integer> drawNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        while (numbers.size() < 6) {
            int num = random.nextInt(49) + 1; // Losuje od 1 do 49
            if (!numbers.contains(num)) {
                numbers.add(num);
            }
        }
        return numbers;
    }


    private static int countHits(ArrayList<Integer> userPicks, ArrayList<Integer> drawnNumbers) {
        int hits = 0;
        for (Integer pick : userPicks) {
            if (drawnNumbers.contains(pick)) {
                hits++;
            }
        }
        return hits;
    }
}