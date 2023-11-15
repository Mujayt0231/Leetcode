public class ReverseString {

    // Write a method that will take one string as an argument and return the
    // reverse version of this string.

    public static void main(String[] args) {

        System.out.println(reverseStr("Hallo"));
        System.out.println(reverseStr2("Hallo"));

    }

    public static String reverseStr(String inputString) {

        StringBuilder sb = new StringBuilder(inputString);
        sb.reverse();

        return sb.toString();
    }

    public static String reverseStr2(String inputString) {

        char[] stringAsChar = inputString.toCharArray();

        String reversed = "";
        for (char c : stringAsChar) {

            reversed = c + reversed;

        }

        return reversed;
    }

}
