package course;



public class StringReverter {

    public static String revert(String str) {
        //leeres Char-Array mit der gleichen Länge wie der String
        char[] reversed = new char[str.length()];
        //String soll von hinten nach vorne angezeigt werden
        for (int i = str.length() - 1; i >= 0; i--) {
        //hier wird das aktuelle Zeichen an der entsprechenden Position im Array hingefügt
            reversed[str.length() - 1 - i] = str.charAt(i);
        }
       //Aray wird in einen String umgewandelt und angezeigt
        return new String(reversed);
    }
    public static void main(String[] args) {
        System.out.println(revert("test")); // tset
        System.out.println(revert("hallo")); // ollah
        System.out.println(revert("")); //
        System.out.println(revert("a")); // a
    }
}
