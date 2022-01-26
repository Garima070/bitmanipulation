public class Clear {
    public static void main(String[] args) {
        int n=5;  //101
        int pos=2;
        int bit=1<<pos;
        int neg=~(bit);
        int res=neg&n;
        System.out.println(res);  //001=1
    }
}
