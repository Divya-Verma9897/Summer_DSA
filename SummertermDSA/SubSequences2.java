import java.util.ArrayList;

public class SubSequences2 {
    static ArrayList<String> subsequence(String s){
        if(s.length()==0){
            ArrayList<String> al=new ArrayList<>();
            al.add("");
            return al;
        }
        char f=s.charAt(0);
        ArrayList<String> result=new ArrayList<>();
          ArrayList<String> al=subsequence(s.substring(1));
          for(String s1: al){
              result.add(s1);
              result.add(s1+f);
            }
        
      return result;

    }
    public static void main(String[] args) {
        String s="abc";
         ArrayList<String> al=subsequence(s);
         System.out.println(al);

    }
}
