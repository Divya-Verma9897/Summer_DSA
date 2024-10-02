import java.util.ArrayList;
import java.util.List;

public class SPascalTraingle {
    static List<List<Integer>> pascal(int row){
        List<List<Integer>> trow=new ArrayList<>();
        for(int i=0; i<row; i++){
            List <Integer> col=new ArrayList<Integer>();  //ArrrayList for every value of i 
            for(int j=0; j<=i; j++){
                if(i==j||j==0){
                    col.add(1);
                }
                else{
                    col.add(j,trow.get(i-1).get(j-1)+ trow.get(i-1).get(j));
                }
            }
trow.add(col);
        }
        return trow;
    }
    public static void main(String[] args) {
        List<List<Integer>> trow=pascal(5);
        System.out.println(trow);
    }
}
