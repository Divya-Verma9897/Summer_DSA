public class PatternAnotherAproach {
    static void Printline(int a) {
        if (a == 0) {
            return;
        }
        // System.out.println(a);
        Printline(a - 1);
        PrintStar(a);
        System.out.println();
        // System.out.println(a);       
        // *      5
        // **     4
        // ***    3 
        // ****   2
        // *****  1
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
        Printline(n);
    }
}
