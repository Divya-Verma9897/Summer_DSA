import java.util.ArrayList;

public class MazePathDProblem {
    static ArrayList<String> walk(int currentrow ,int currentcolumn , int row , int coloumn){
        if(currentrow==row && currentcolumn==coloumn){
        ArrayList <String> list=new ArrayList<>();
        list.add("");
        return list;
        }
        if(currentrow>row || currentcolumn>coloumn){
            ArrayList <String> list=new ArrayList<>();
            return list;
        }
          ArrayList <String> Finalist=new ArrayList<>();
          ArrayList<String> downlist=walk(currentrow+1, currentcolumn, row, coloumn);
          for(String s : downlist){
Finalist.add("D"+s);
          }
          ArrayList <String> Rightlist =walk(currentrow, currentcolumn+1, row, coloumn);
           for(String s : Rightlist){
 Finalist.add("R"+s);           
          }
          ArrayList<String> diagonallist=walk(currentrow-1, currentcolumn, row, coloumn);
          for(String s : diagonallist){
Finalist.add("U"+s);
          }
              ArrayList<String> Left=walk(currentrow, currentcolumn-1, row, coloumn);
          for(String s : Left){
Finalist.add("L"+s);
          }
        return Finalist;

    }
    public static void main(String[] args) {
        int row=2;
        int coloumn=2;
        ArrayList<String> list=walk(0, 0, row, coloumn);
        System.out.println(list);
    }
}
