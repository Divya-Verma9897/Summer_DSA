public class Sorted {
    static boolean Sort(int a[],int index)
{
    if(index==a.length-1){
        return true;
    }
    if(a[index]<a[index+1]){
        return Sort(a, index+1);
    }
    else{
        return false;
    }
   

}   
 public static void main(String[] args) {
        int a[]={1,3,121,90};
        if(Sort(a, 0)){
            System.out.println("True");
        }
        else{

            System.out.println("False");
        }
        // Sort(a, 0);
    }
}
