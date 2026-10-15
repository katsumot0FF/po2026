package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> typy = new ArrayList<>();

        if (args.length > 0) {
            for (String arg : args) {
                typy.add(Integer.parseInt(arg));
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj 6 liczb (oddzielonych spacją): ");
            while (typy.size() < 6) {
                typy.add(scanner.nextInt());
            }
        }

        ArrayList<Integer> wylosowane = new ArrayList<>();
        Random random = new Random();

        while (wylosowane.size() < 6) {
            int liczba = random.nextInt(49) + 1;
            if (!wylosowane.contains(liczba)) {
                wylosowane.add(liczba);
            }
        }

        int trafienia = 0;
        for (int typ : typy) {
            if (wylosowane.contains(typ)) {
                trafienia++;
            }
        }

        System.out.println("Twoje typy: " + typy);
        System.out.println("Wylosowane liczby: " + wylosowane);
        System.out.println("Liczba trafień: " + trafienia);
    }
}