public class Hanio {
    static void  HanioTower(int n, String Source ,String Helper ,String Destination){
    if(n==1){
        System.out.println(" Move "+n+" from "+Source+"to "+Destination);
        return;
    }
    HanioTower(n-1, Source, Destination, Helper);
    System.out.println(" Move "+n+" from "+Source+"to "+Destination);
    HanioTower(n-1, Helper, Source, Destination);
    }
    public static void main(String[] args) {
        int n=3;
        HanioTower(n, "S", "H", "D");
    }
}
