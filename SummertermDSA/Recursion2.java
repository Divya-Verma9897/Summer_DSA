public class Recursion2 {
    // static void Factorial(int num , int result){
    // if(num==1){
    //     System.out.println(result);
    //     return;
    // }
    
    // Factorial(num-1, num*result);        // result=result*num;
    // }
    static int Factorial(int num ){
    if(num==1){
        return 1;
    }
    int fact=Factorial(num-1);
    int result=fact*num;
    return result;
    // return fact*num;
    }
    public static void main(String[] args) {
        int num=6;
        System.out.println(Factorial(num));
      
    }
}
