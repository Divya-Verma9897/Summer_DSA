public  class SubsequenceString{
    static void subsequence(String s, String result){
if(s.length()==0){
    System.out.println(result);
    return;
}
char f=s.charAt(0);
String smallestString=s.substring(1);
subsequence(smallestString, result);
subsequence(smallestString, result+f);
    }
    public static void main(String[] args) {
        String s="abc";
        subsequence(s, "");
    }
}
