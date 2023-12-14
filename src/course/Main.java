package course;

public class Main {

    public static String generateRandomString() {
        // Implementieren Sie die Logik hier
        return "random"; // Ändern Sie dies entsprechend
    }

    // Die main Methode
    public static void main(String[] args) {
        // Erstellen Sie einen StringBuilder mit einer anfänglichen Kapazität von 10000 * 10
        // Angenommen, generateRandomString() erzeugt eine Zeichenfolge der Länge 10
        StringBuilder result = new StringBuilder(100000);
        for (int i = 0; i < 10000; i++) {
            // Fügen Sie die zufällige Zeichenfolge an den StringBuilder an
            result.append(generateRandomString());
        }
        // Konvertieren Sie den StringBuilder in einen String
        String finalResult = result.toString();
        // Geben Sie das Ergebnis aus
        System.out.println(finalResult);
    }






}
