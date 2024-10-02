

public class StringRecursion{
    //Without recursion
// public static StringBuilder singleOccurence(String s)
// {
//     StringBuilder sb = new StringBuilder();
//     if (s.length() > 0) {
//         char prev = s.charAt(0);
//         char c='#';
//         System.out.println(prev);
//         sb.append(s);
//         for (int i = 1; i < s.length(); ++i) {
//             char cur = s.charAt(i);
//             // System.out.println(cur);
//             if (cur == prev) {
//                 sb.setCharAt(i, c);
                
//             }
//             else{
//                 prev=s.charAt(i);
//             }
//         }
//     }
//     return sb;
// }

//Output : aabbccc
    //   : a#b#c##

// static StringBuilder singleOccurence(String s){
//     StringBuilder sb = new StringBuilder();
//     if (s.length() > 0) {
//         char prev = s.charAt(0);
//         char c='*';
//         sb.append(s);
//         for (int i = 1; i<s.length(); ++i) {
//             char cur = s.charAt(i);
          
//             if (cur == prev) {     
//                 // int a= indexOf(cur);
//                 // System.out.println(a);
//                 sb.insert(i, c);
//                 // System.out.println(i);
//             }
//             else{          
//                 prev=s.charAt(i);
//                 // System.out.println(indexOf(cur));
//     }
// }
//     }
//     return sb;

// }
static String output="";
    static void singleOccurence(String s,int i){
        // output=output+s.charAt(i);
        if(i==s.length()-1){
            return ;
        }
if(s.charAt(i)==s.charAt(i+1)){
    output=i+"*"+(i+1);
}
System.out.println(output);
singleOccurence(s, i+1);
    }

   
    public static void main(String[] args) {
        String s="aabbd";
    //  System.out.println(singleOccurence(s,0));
    // singleOccurence(s, 0);
   
    singleOccurence(s, 0);
    // System.out.print(singleOccurence(s, 0));
        
     
  
     
        
    }
}
