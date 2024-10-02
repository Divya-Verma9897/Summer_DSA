public class Occurenece {
    static int first=-1;
static int second=-1;
    static void Ocuurenece(String s ,int index,int element){
        if(index==s.length()){
            System.out.println(first);
            System.out.println(second);
            return;
        }
      char fchar=s.charAt(index);
      if(fchar==element){
      if(first==-1){
          first=index;
      }
      else{
        second=index;
      }
    }
      Ocuurenece(s, index+1, element);
    }
    public static void main(String[] args) {
        String s="aabbabbaaahybyu";
        Ocuurenece(s, 0, 'b');
    }
}
