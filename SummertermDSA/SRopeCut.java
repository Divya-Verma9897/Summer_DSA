public class SRopeCut {
    static int RopeCut(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }
        int cutfroma = RopeCut(n - a, a, b, c);
        int cutfromb = RopeCut(n - b, a, b, c);
        int cutfromc = RopeCut(n - c, a, b, c);
        int piece = Math.max(Math.max(cutfroma, cutfromb), cutfromc);
        if (piece == -1) {
            return -1;
        }
        return piece + 1;
    }

    public static void main(String[] args) {
        int n = 10;
        int a = 2;
        int b = 4;
        int c = 5;
        System.out.println(RopeCut(n, a, b, c));

    }
}
