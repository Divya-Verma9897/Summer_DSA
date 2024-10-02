public class Recursion7 {
    static void CountZero(int num,int count ){
        if(num==0){
           System.out.println(count); 
           return;
        }
        int rem=num%10;
        if(rem==0){
            count++;
        }
        CountZero(num/10, count);
    }

    public static void main(String[] args) {
        int num=100010000;
        CountZero(num,1);
      
    }
}
