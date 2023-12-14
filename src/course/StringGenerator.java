package course;

public class StringGenerator {

    public static String generateRandomString() {
        // Implementiere die Logik hier
        return "random"; // Ändere dies entsprechend
    }

    // Die main Methode
    public static void main(String[] args) {
        // Erstelle einen StringBuilder mit einer anfänglichen Kapazität von 10000 * 10
        // Angenommen, generateRandomString() erzeugt eine Zeichenfolge der Länge 10
        StringBuilder result = new StringBuilder(100000);
        for (int i = 0; i < 10000; i++) {
            // Füge die zufällige Zeichenfolge an den StringBuilder an
            result.append(generateRandomString());
        }
        // Konvertiere den StringBuilder in einen String
        java.lang.String finalResult = result.toString();
        // Gebe das Ergebnis aus
        System.out.println(finalResult);
    }
}