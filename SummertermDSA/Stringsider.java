public class Stringsider{
    static void Side(String s,int index ,int count ,String news){
        if(s.length()==index){
            for(int i=0;i<count;i++){
                news+='x';
            }
            System.out.println(news);
            return;
        }

   char curr=s.charAt(index);
        if(curr=='x'){
            count++;
            Side(s,index+1, count, news);  
        }
        else{
            news+=curr;
             Side(s,index+1, count, news);  
        }
        
    }
    public static void main(String[] args) {
        String s="axaxxxxxxabxxxxxxa";
        String news="";
        Side(s, 0, 0, news);
    }
}