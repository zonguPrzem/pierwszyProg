package pierwszyProg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skaner  = new Scanner(System.in);

        System.out.println(" Podaj dwa boki prostokąta");
        double protokątA = skaner.nextDouble();
        double protokątB = skaner.nextDouble();
        System.out.println("Podaj dwie przyprotokątne trójkąta protokątnego ");
        double trójkątA= skaner.nextDouble();
        double trójkątB= skaner.nextDouble();
        System.out.println("Podaj promień koła");
        double kołoR = skaner.nextDouble();
    }
}
