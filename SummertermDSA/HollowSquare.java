public class HollowSquare {

    static void printline(int n, int star){
        if(n==0){
            // System.out.println();
            return;
        }
        System.out.println();
        if(n==0 || n==n-1 ){
            printStar(star);
        }
        printline(n-1, star);

    }
    static void printStar(int star){
        if(star==0){
            return;
        }
        System.out.print("*");
        printStar(star - 1);
    }
    public static void main(String[] args) {
        int n=5;
        printline(n, 1);
    }
}
