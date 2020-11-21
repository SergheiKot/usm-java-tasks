package md.usm.javatasks;

public class Main {

    private static int getRandomNumber() {
        return (int) (Math.random() * 5);
    }

    public static void main(String[] args) {

        String[] article = new String[] {"the", "a", "one", "some", "any"};
        String[] noun = new String[] {"boy", "girl", "dog", "town", "car"};
        String[] verb = new String[] {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = new String[] {"to", "from", "over", "under", "on"};

        StringBuilder stringBuilder;
        String firstWord;

        for (int i = 0; i < 20; i++) {

            stringBuilder = new StringBuilder();

            firstWord = stringBuilder.append(article[getRandomNumber()]).toString();

            firstWord = firstWord.replace(firstWord.charAt(0),
                    String.valueOf(firstWord.charAt(0)).toUpperCase().charAt(0));

            stringBuilder = new StringBuilder();
            stringBuilder.append(firstWord);
            stringBuilder.append(" ");
            stringBuilder.append(noun[getRandomNumber()]);
            stringBuilder.append(" ");
            stringBuilder.append(verb[getRandomNumber()]);
            stringBuilder.append(" ");
            stringBuilder.append(preposition[getRandomNumber()]);
            stringBuilder.append(" ");
            stringBuilder.append(article[getRandomNumber()]);
            stringBuilder.append(" ");
            stringBuilder.append(noun[getRandomNumber()]);
            stringBuilder.append(".");

            System.out.println(stringBuilder);
        }
    }
}