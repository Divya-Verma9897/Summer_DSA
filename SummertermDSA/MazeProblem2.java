public class MazeProblem2 {
static void walk(int currentrow,int currentcoloumn,int row,int column , String result){
if(currentcoloumn==column&& currentrow==row){
System.out.println(result);
return;
}
if(currentcoloumn>column || currentrow>row){
return;
}
walk(currentrow+1, currentcoloumn, row, column, "R"+result);
walk(currentrow, currentcoloumn+1, row, column, "D"+result);
walk(currentrow+1, currentcoloumn+1, row, column, "I"+result);
    }
    public static void main(String[] args) {
      walk(0,0,2,2,"");
        
    }
}
