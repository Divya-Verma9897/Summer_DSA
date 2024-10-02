public class SPsuperpow {
        
    static int base = 1337;
    public static int superPow(int a, int[] b) {
        return superP(a,b,b.length);
    }
    private static int superP(int a, int[] b, int len){
        if(len == 0) return 1;
        int last = b[len-1];
        len--;
        
        int part1 = myPow(a,last);
        int part2 = myPow(superP(a,b,len),10);
        return (part2*part1)%base;
    }

    private static int myPow(int a, int b){
        if(b==0) return 1;
        a = a%base;

        if(b%2 == 1){
            return (a*myPow(a,b-1))%base;
        }else{
            int sub = myPow(a,b/2);
            return (sub*sub)%base;
        }
    }

    
        public static void main(String[] args) {
            int a=2;
            int b[]=new int[2];
            b[0]=1;
            b[1]=0;
            // System.out.println(b[1]);
            System.out.println(  superPow(a,b));
          
        }
    }
