

public class Recursion10 {
    static boolean checkPlidrome(String s ){
        if(s.length()==0|| s.length()==1){
            return true;
        }
        else if(s.charAt(0)==s.charAt(s.length()-1))
            return checkPlidrome(s.substring(1,s.length()-1));
        
        return false;
    }
    public static void main(String[] args) {
        String s="abaaba";
        if(!checkPlidrome(s))
            System.out.println("Not a Palidrome No.");
    
        else
        System.out.println(" Palidrome Number");
        // String result="";
                // System.out.println(checkPlidrome(s));\
              
       
        
    }
}
