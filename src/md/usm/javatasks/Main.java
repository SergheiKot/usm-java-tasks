package md.usm.javatasks;

public class Main {
    public static void main(String[] args) {

        System.out.println("1 * 2 * 3 * 4 * 5 = " + product(1, 2, 3, 4, 5));

        System.out.println("3 * 3 * 3 * 3 = " + product(3, 3, 3, 3));

        System.out.println("1 * 0 * 1 = " + product(1, 0, 1));

        System.out.println("-1 * 1 = " + product(-1, 1));
    }

    public static int product(int... args) {
        int result = 1;

        for (int value : args) {
            result *= value;
        }
        return result;
    }
}