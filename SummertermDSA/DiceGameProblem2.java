

public class DiceGameProblem2 {
     static void diceGame(int curentvalue , int endvalue , String result){
        if(curentvalue==endvalue){
          System.out.println(result);
        return;
        }
        if(curentvalue>endvalue){
            return ;
        }
        for(int dice=1; dice<=6; dice++){
            int newvalue=curentvalue +dice;
          diceGame(newvalue, endvalue,result+dice);
        }
    }

    
    public static void main(String[] args) {
       diceGame(0,3,"");
        
        // System.out.println(result);
 }
}
