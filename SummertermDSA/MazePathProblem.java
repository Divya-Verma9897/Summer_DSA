

// public class MazePathProblem{
//     static ArrayList<String> walk(int currentrow ,int currentcolumn , int row , int coloumn){
//         if(currentrow==row && currentcolumn==coloumn){
//         ArrayList <String> list=new ArrayList<>();
//         list.add("");
//         return list;
//         }
//         if(currentrow>row || currentcolumn>coloumn){
//             ArrayList <String> list=new ArrayList<>();
//             return list;
//         }
//           ArrayList <String> Finalist=new ArrayList<>();
//           ArrayList<String> downlist=walk(currentrow+1, currentcolumn, row, coloumn);
//           for(String s : downlist){
// Finalist.add("D"+s);
//           }
//           ArrayList <String> Rightlist =walk(currentrow, currentcolumn+1, row, coloumn);
//            for(String s : Rightlist){
//  Finalist.add("R"+s);           
//           }
//         return Finalist;

//     }
//     public static void main(String[] args) {
//         int row=4;
//         int coloumn=4;
//         ArrayList<String> list=walk(0, 0, row, coloumn);
//         System.out.println(list);
//     }
// }
