package course;

import java.util.Arrays;

public class StringisAnagram {



        public static boolean isAnagram(String str1, String str2) {
            // Entferne Leerzeichen und konvertiere zu Kleinbuchstaben
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            // Überprüfe, ob die Längen gleich sind
            if (str1.length() != str2.length()) {
                return false;
            }

            // Konvertiere Zeichenketten zu char-Arrays
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // Sortiere die char-Arrays manuell
            sortCharArray(charArray1);
            sortCharArray(charArray2);

            // Vergleiche die sortierten char-Arrays
            return Arrays.equals(charArray1, charArray2);
        }

        // Einfache Bubble-Sort-Methode für char-Arrays
        private static void sortCharArray(char[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Tausche die Elemente, wenn sie in falscher Reihenfolge sind
                        char temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            String word1 = "Desperation";
            String word2 = "A Rope Ends It";

            if (isAnagram(word1, word2)) {
                System.out.println("'" + word1 + "' und '" + word2 + "' sind Anagramme.");
            } else {
                System.out.println("'" + word1 + "' und '" + word2 + "' sind keine Anagramme.");
            }
        }






}
