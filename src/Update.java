import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int input=s.nextInt();
        int n=3;  //0011
        int pos=2;
        int bit=1<<pos;
        int res;
        if(input==0)
        {
           int neg=~(bit);
           res=neg&n;
            System.out.println(res);
        }
        else
        {
            res=bit|n;
            System.out.println(res);
        }
    }
}
