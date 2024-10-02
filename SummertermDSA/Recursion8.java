public class Recursion8 {
    static boolean PrimeNumber(int n,int i){
        if (n <= 2)
        return (n == 2) ? true : false;
    if (n % i == 0)
        return false;
    if (i * i > n)
        return true;
  
    // Check for next divisor
    return PrimeNumber(n, i + 1);
}
 
    public static void main(String[] args) {
        int n=5;
        System.out.println(PrimeNumber(n,2));
        
    }
}
