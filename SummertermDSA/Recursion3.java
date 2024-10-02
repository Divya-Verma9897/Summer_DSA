public class Recursion3 {
    static String reverse(String str) {
        if (str.length() == 1) {
            return str;
        }
        String str1 = str.substring(1);
        String smallresult = reverse(str1);
// System.out.println(smallresult);
        char Fchar = str.charAt(0);

        return smallresult+Fchar;

    }

    public static void main(String[] args) {
        String str = "abcsa";
        System.out.println(reverse(str));

    }
}
