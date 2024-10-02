// import java.util.ArrayList;
// import java.util.List;

// public class Permutation {
// static ArrayList<String>  Perm(String s){
// if(s.length()==0){
//     ArrayList<String> al=new ArrayList<>();
//     al.add("");
//     return al;
// }
// char f=s.charAt(0);
// ArrayList<String> finallist=new ArrayList<>();
// ArrayList<String > stack=Perm(s.substring(1));
// for(String t : stack){
//     for(int i=0; i<=t.length(); i++){
// StringBuilder sb=new StringBuilder(t);
// sb.insert(i,f);
// finallist.add(sb.toString());

//     }
// }
// return finallist;
// }
//     public static void main(String[] args) {
//         // String s="abc";
//         // ArrayList<String> al=Perm(s);
//         // System.out.println(al);
//         System.out.println(Perm("abcd"));
//     }
// }

// Java program to print all the permutations
// of the given string
public class Permutation {

	// Function to print all the permutations of str
	static void printPermutn(String str, String ans)
	{

		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

for (int i = 0; i < str.length(); i++) {

			// ith character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding
			// the ith character
            String Left=str.substring(0, i);
          
            String Right=str.substring(i+1);
			String ros = Left+Right;

			// Recursive call
			printPermutn(ros, ans + ch);
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		String s = "abc";
		printPermutn(s, "");
	}
}




