import java.math.BigInteger;
public class Problem16{
    public static void main(String[] args){
        int c = 1;
        for(int i = 0; i < 1000; i++){
            c = (c * 2) % 1000;
        }
        System.out.println(c);
        BigInteger b = new BigInteger("2");
        String s = b.pow(1000).toString();
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += Integer.parseInt(s.substring(i, i + 1));
        }
        System.out.println(sum);
    }
}
