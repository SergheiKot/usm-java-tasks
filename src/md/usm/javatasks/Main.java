package md.usm.javatasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>(Arrays.asList("Nick", "Tony", "Iowa", "Ivan", "Don",
                "Tina", "Tony", "Iowa", "Ira", "Natti", "Ivan"));

        System.out.println("First names:");
        names.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a first name: ");

        System.out.println(names.contains(
                scanner.nextLine()) ? "We have this first name in Set!" : "We don't have this first name in Set!");
    }
}