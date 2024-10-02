public class SClimbingStairs {
    static int   Climb(int n){
if(n==1 || n==2){
return n;
}
return Climb(n-1)+Climb(n-2);
    }
    public static void main(String[] args) {
        int n=45;
        System.out.println(Climb(n));
     
    }
}
//TC=O(2pown)
//SC=Space complexity
//we have two way to climb stairs

