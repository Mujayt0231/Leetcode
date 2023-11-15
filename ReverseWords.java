public class ReverseWords {

    public static void main(String[] args) {

        System.out.println(reverseWords("apple banana kiwi"));

    }

    public static String reverseWords(String inputString) {

        StringBuilder sb = new StringBuilder();

        String[] stringArray = inputString.split(" ");

        for (int i = stringArray.length - 1; i >= 0; i--) {

            sb.append(stringArray[i]).append(" ");

        }

        return sb.toString();
    }

}
