package course;



    public class Palindrom{

        public static void main(String[] args) {
            palindrom("Der vor dir stehende Rentner heißt Otto Uwe");
        }

        public static void palindrom(String text) {
            // Teile den Text in Wörter auf
            String[] words = text.split("\\s");

            // Iteriere über jedes Wort und überprüfe, ob es ein Palindrom ist
            for (String word : words) {
                if (isPalindrome(word)) {
                    System.out.println(word);
                }
            }
        }

        public static boolean isPalindrome(String word) {
            // Entferne Leerzeichen und konvertiere zu Kleinbuchstaben
            String cleanedWord = word.replaceAll("\\s", "").toLowerCase();

            // Vergleiche das Wort mit seinem umgekehrten Wort
            String reversedWord = new StringBuilder(cleanedWord).reverse().toString();

            return cleanedWord.equals(reversedWord);
        }
    }
