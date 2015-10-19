//What is the 10 001st prime number?
import java.util.*;
public class Problem6{
    public static void main(String[] args){
        //int est = (int)(10001.0*Math.log10(100001));
        //int top = (int)(est*1.1);
        //int[] primes = new int[10001];
        //int[][] list = new int[top][2];
        //for (int i = 0; i < list.length; i++){
            //list[i][0] = i + 2;
            //list[i][1] = 0;
        //}
        //while (primes[10000] == 0){
            //int next = 2;
            //for(int i = 0 + next; i < top && primes[10000] == 0; i += next){
                //list[i][1] = 1;
            //}
            //int n = 0;
            //for(int i = next - 1; n == 0; i++){
                //if(list[i][1] == 0){
                    //n = list[i][0];
                //}
            //}
            //next = n;
            //System.out.println(next);
        //}
        int n = 10001, f = 1;
        for(int i = 3; f < 10001; i+=2){
            if(isPrime(i)) f++;
            if(f == 10001) System.out.println(i);
        }
    }

    public static boolean isPrime(int a){
        int top = (int)Math.sqrt(a);
        if(a % 2 == 0) return false;
        int i;
        for(i = 3; i <= top; i+=2){
            if(a % i == 0) return false;
        }
        System.out.println(i);
        return true;
    }
}
