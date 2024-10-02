public class Recursion1 {
    //  static void Armstrong(int num , int sum){
    //     if(num==0){
    //         System.out.println(sum);
    //         return;
    //     }
    //     int rem=num%10;
    //     sum=sum+rem;
    //     Armstrong(num/10, sum);
    // }
    static int Armstrong(int num ){
            if(num==0){ 
                return 0;
            }
            int sum=Armstrong(num/10);
            //stack fall 
            int rem=num%10;
            sum=sum+rem;
            return sum; 
           
        }
    public static void main(String[] args) {
       int a=2993;
       System.out.println( Armstrong(a));
      
    }
}
