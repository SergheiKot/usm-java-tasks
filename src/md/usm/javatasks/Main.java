package md.usm.javatasks;

import java.util.Scanner;

public class Main {

    private static void printLatinWord(String token) {

        token = token.concat(String.valueOf(token.charAt(0)))
                .replaceFirst(String.valueOf(token.charAt(0)), "");

        System.out.print(token + "ay" + " ");
    }

    public static void main(String[] args) {

        System.out.print("Please enter a text: ");
        Scanner scanner = new Scanner(System.in);

        String[] inputWords = scanner.nextLine().split(" ");

        for (String token : inputWords) {
            printLatinWord(token);
        }
    }
}