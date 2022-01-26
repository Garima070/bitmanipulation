public class Get {
        public static void main(String[] args) {
            int n=5;  //101
            int pos=1;
            int bit=1<<pos;
            int res=bit&n;
            if(res==0)
                System.out.println("position is zero");
            else
                System.out.println(" position is not zero");
        }
    }
