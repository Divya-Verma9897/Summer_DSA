public class SFindTheWinner {
    static int FindWinner(int n , int k){
        return helper(n, k)+1;
    }
    static int helper(int n,int k){
        if(n==1)
        {
            return 0;
        }
        return (helper(n-1, k)+k)%n;

    }
    
    public static void main(String[] args) {
        int n=5;
        System.out.println(FindWinner(n, 4));
    
    }
}
