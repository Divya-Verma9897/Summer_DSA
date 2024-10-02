import java.util.ArrayList;
public class DiceGameProblem {
    static ArrayList<String> diceGame(int curentvalue , int endvalue){
        if(curentvalue==endvalue){
            ArrayList <String> result=new ArrayList<>();
result.add("");
        return result;
        }
        if(curentvalue>endvalue){
            ArrayList <String> result=new ArrayList<>();
            return result;
        }
        ArrayList<String> finalresult=new ArrayList<>();
        for(int dice=1; dice<=6; dice++){
            int newvalue=curentvalue +dice;
            ArrayList <String> list=diceGame(newvalue, endvalue);
for(String s : list){
                finalresult.add(dice+s);
            }
        }
        return finalresult;
        
    }

    
    public static void main(String[] args) {
        ArrayList<String> result = diceGame(0,3);
        System.out.println(result);
 }
}
