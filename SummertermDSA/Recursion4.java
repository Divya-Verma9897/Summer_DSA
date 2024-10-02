public class Recursion4{
    // https://skillrisers.com/course/5277184-learn-to-build-web-resume
 static boolean ArraySort(int a[] , int index  ){
    if(a.length-1==index){
    //    System.out.println(a);
        return true ;
    }
    if(a[index]>a[index+1]){
        return false;
    }
    return ArraySort(a, index+1);
 }
    public static void main(String[] args) {
        int a[]={12,34,56,72,88};
       if(ArraySort(a, 0)){
        System.out.println("Sorted");
       }
       else{
        System.out.println("Not SOrted");
       }
    }
}