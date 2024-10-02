public class Recursion6 {
    // static int SumOfNaturalNo(int n ){
    //     if(n==0){
    //         return 0;
    //     }
    //    int result= SumOfNaturalNo(n-1);
    //     int sum=result+n;
    //     return sum;
    // }
    static void SumOfNaturalNo(int n , int sum){
        if(n==0){
            System.out.println(sum);
            return ;
        }
        sum=n+sum;
        SumOfNaturalNo(n-1,sum);
       
    }

    public static void main(String[] args) {
        int n=4;
       SumOfNaturalNo(n,0);
        
    }
}
