public class Recursion5 {
    static int Power(int n , int m){
        if(m!=0){
            int result=n*Power(n, m-1);
            System.out.println(result);
        return  result;
        }
        else{
            return 1;
        }
    }
  

    public static void main(String[] args) {
        int n=3;
        int m=4;
       System.out.println(Power(n,m));
       
        
    }
}
