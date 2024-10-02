public class STwopower {
static boolean checkPowerOfTwo(int n){
    if(n<1){
        return false;
        }
if(n==1){
return true;
}
if(n%2==0)
    return checkPowerOfTwo(n/2);

    return false;


}
    public static void main(String[] args) {
        int n=255;
        if( checkPowerOfTwo(n)){
            System.out.println("Power of two");
        }
        else{
            System.out.println("Not a Power of two");
        }
    
    }
}
