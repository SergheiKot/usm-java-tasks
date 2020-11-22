package md.usm.javatasks;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Character, Integer> myMap = new HashMap<>();

        createMap(myMap);
        displayMap(myMap);
    }

    private static void createMap(Map<Character, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        char[] input = scanner.nextLine().toLowerCase().toCharArray();

        for (char symbol : input) {
            if (symbol == ' ') {
                continue;
            }

            if (map.containsKey(symbol)) {
                map.put(symbol, map.get(symbol) + 1);
            } else {
                map.put(symbol, 1);
            }
        }
    }

    private static void displayMap(Map<Character, Integer> map) {

        Set<Character> keys = map.keySet();
        SortedSet<Character> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        for (Character key : sortedKeys) {
            System.out.printf("%-10s%s%n", key, map.get(key));
        }

        System.out.printf("%nSize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }
}