public class SPPowerOfThree {
    static boolean ispowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 3== 0) {
         return   ispowerOfThree(n / 3);
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 64;
        if (ispowerOfThree(n)) {
            System.out.println("Power of three");
        } else {
            System.out.println("Does Not Power of three");
        }
    }
}