package course;



public class StringReverter {

    private static String[] args;

    public static String revert(String str) {
        //leeres Char-Array mit der gleichen Länge wie der String
        char[] reversed = new char[str.length()];
        //String soll von hinten nach vorne angezeigt werden
        for (int i = str.length() - 1; i >= 0; i--) {
        //hier wird das aktuelle Zeichen an der entsprechenden Position im Array hinzugefügt
            reversed[str.length() - 1 - i] = str.charAt(i);
        }
       //Aray wird in einen String umgewandelt und angezeigt
        return new String(reversed);
    }

    public static String monthAsString(String str) {
        // Split the string by dots and get the second element as the month number
        String monthNum = str.split("\\.")[1];
        // Declare a variable to store the month name
        String monthName = "";
        // Use a switch statement to assign the month name according to the month number
        switch (monthNum) {
            case "01":
                monthName = "Januar";
                break;
            case "02":
                monthName = "Februar";
                break;
            case "03":
                monthName = "März";
                break;
            case "04":
                monthName = "April";
                break;
            case "05":
                monthName = "Mai";
                break;
            case "06":
                monthName = "Juni";
                break;
            case "07":
                monthName = "Juli";
                break;
            case "08":
                monthName = "August";
                break;
            case "09":
                monthName = "September";
                break;
            case "10":
                monthName = "Oktober";
                break;
            case "11":
                monthName = "November";
                break;
            case "12":
                monthName = "Dezember";
                break;
            default:
                monthName = "Ungültiger Monat";
        }
        // Return the month name
        return monthName;
    }
    public static void main(String[] args) {

        System.out.println(revert("test")); // tset
        System.out.println(revert("hallo")); // ollah
        System.out.println(revert("")); //
        System.out.println(revert("a")); // a

        System.out.println(monthAsString("01.09"));
    }
}
