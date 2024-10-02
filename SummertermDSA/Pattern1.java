public class Pattern1 {
    static void Printline(int a, int star) {
        if (a == 0) {
            return;
        }
        PrintStar(star);
        // System.out.println();
        // Printline(a - 1, star);
        // Printline(a - 1, star-1);
        System.out.println(a);
        Printline(a - 1, star+1);
        // System.out.println(a);
    }

    static void PrintStar(int noofStar) {
        if (noofStar == 0) {
            return;
        }
        System.out.print("*");
        PrintStar(noofStar - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        Printline(n, star);   }
}
