public class SCoinProblem {
    
     static void CoinSum(int[] coins , int amt ,int index  , String result){
        if(amt==0){
            // String res=result+(amt-coins.length);/
          System.out.println(result);
        return;
        }
        if(amt<0){
            return ;
        }
         if(amt>0 && index==coins.length){
            return ;
        }
        // for(int dice=1; dice<=3; dice++){
           
          CoinSum(coins,amt-coins[index],index+1,result);
          CoinSum(coins, amt, index+1, result);
        // }
    }

//     static int CoinSum(int[] coins , int amt,  int index){
// if(amt==0){
//     return 1;

// }
// if(amt<0){
//     return 0;
// }
// if(amt>0 && index==coins.length){
//     return 0;
// }
// return CoinSum(coins, amt-coins[index], index) +CoinSum(coins, amt, index+1);
//     }
    public static void main(String[] args) {
        int []a={1,2};
        int sum=3;
        
        CoinSum(a, sum, 0,"");
        
    }
}
