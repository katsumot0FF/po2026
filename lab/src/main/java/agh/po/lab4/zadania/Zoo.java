package agh.po.lab4.zadania;


import agh.po.lab4.animals.Animal;
import agh.po.lab4.animals.Dog;
import agh.po.lab4.animals.Parrot;
import agh.po.lab4.animals.Snake;
import java.util.Random;

public class Zoo {
    public Animal[] animals = new Animal[100];
    public void fillRandomly() {
        Random random = new Random();
        for (int i = 0; i < animals.length; i++) {
            int los = random.nextInt(3);
            switch (los) {
                case 0:
                    animals[i] = new Parrot("Poli_" + i);
                    break;
                case 1:
                    animals[i] = new Dog("Burek_" + i);
                    break;
                case 2:
                    animals[i] = new Snake("Syk_" + i);
                    break;
            }
        }
    }

    public int sumLegs() {
        int sum = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                sum += animal.legs;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.fillRandomly();
        System.out.println("Zwierzęta zostały losowo wygenerowane.");
        System.out.println("Łączna liczba nóg wszystkich zwierząt wynosi: " + zoo.sumLegs());
    }
}
