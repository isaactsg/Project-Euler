import java.util.*;
import java.math.*;
public class Problem29{
    public static void main(String[] args){
        ArrayList<BigInteger> pwr = new ArrayList<>();
        for (int i = 2; i <= 100; i++){
            for (int j = 2; j <= 100; j++){
                BigInteger power = new BigInteger(i + "");
                power = power.pow(j);
                if(pwr.indexOf(power) == -1) pwr.add(power);
            }
        }
        System.out.println(pwr.size());
    }
}
