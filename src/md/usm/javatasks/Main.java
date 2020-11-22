package md.usm.javatasks;

import md.usm.javatasks.exceptions.InvalidSubscriptException;

public class Main {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        try {
            System.out.printf("Array intArray contains:%n");
            printArray(intArray);
            printArray(intArray, 2, 4);
            System.out.printf("%nArray doubleArray contains:%n");
            printArray(doubleArray);
            printArray(doubleArray, 0, 3);
            System.out.printf("%nArray charArray contains:%n");
            printArray(charArray);
            printArray(charArray, -1, 2);
        } catch (InvalidSubscriptException e) {
            System.out.println("Exception!");
        }
    }

    public static <T> void printArray(T[] inputArray) {

        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static <T> int printArray(T[] inputArray, int lowSubscript, int highSubscript) throws InvalidSubscriptException {

        if (lowSubscript >= inputArray.length || lowSubscript < 0 || highSubscript >= inputArray.length
                || highSubscript < 0 || lowSubscript > highSubscript) {
            throw new InvalidSubscriptException();
        }

        int counter = 0;

        for (int i = lowSubscript; i <= highSubscript; i++) {
            System.out.printf("%s ", inputArray[i]);
            counter++;
        }
        System.out.println("Counter: " + counter);
        
        return counter;
    }
}