public class Recursion{
 static void show(int a){
    if(a==0){
        return ;
    }
    System.out.println("hello " + a); //stack Build 
    show(a-1);
    System.out.println("Bye "+a);   //Stack Fall
    
}
    public static void main(String[] args) {
        show(5);
    }
}