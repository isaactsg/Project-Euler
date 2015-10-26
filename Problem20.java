import java.math.BigInteger;
public class Problem20{
    public static void main(String[] args){
        BigInteger b = new BigInteger("1");
        for(int i = 2; i <= 100; i++){
            BigInteger m = new BigInteger(i + "");
            b = b.multiply(m);
        }
        System.out.println(b.toString());
        String s = b.toString();
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += Integer.parseInt(s.substring(i, i + 1));
        }
        System.out.println(sum);
    }
}
