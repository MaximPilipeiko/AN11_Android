public class TextFormatter {
    public static int calculateWordsCount(final String line) {
        return splitOnWords(line.trim()).length;
    }

    public static boolean hasPalindrome(final String line) {
        final String[] words = splitOnWords(line);
        for (final String word : words) {
            if (isPalindrome(word)) {
                return true;
            }
        }

        return false;
    }

    public static String[] splitOnWords(final String line) {
        return line.trim().split("\\W+");
    }

    public static String[] splitOnSentences(final String text) {
        return text.split("[.!?]");
    }

    private static boolean isPalindrome(final String word) {
        final String reversedWord = new StringBuilder(word).reverse().toString();
        return word.length() > 3 && word.equals(reversedWord);
    }
}
