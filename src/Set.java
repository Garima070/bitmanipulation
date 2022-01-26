public class Set {
    public static void main(String[] args) {
        int n=4;  //100
        int pos=1;
        int bit=1<<pos;
        int res=bit|n;
        System.out.println(res); //110=6
    }
}
