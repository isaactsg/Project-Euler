public class Problem12{
    public static void main(String[] args){
        int divisors = 1;
        int last = 0;
        for(int i = 1; divisors <= 500; i++){
            divisors = 2;
            int sum = last + i;
            last = sum;
            if(sum % 2 != 0 || sum % 3 != 0 || sum % 5 != 0 || sum % 7 != 0 || sum % 11 != 0 || sum % 13 != 0 || sum % 17 != 0) continue;
            for(int j = 3; j <= sum; j++){
                if(sum % j == 0) divisors++;
            }
            if (divisors > 200) System.out.println(divisors + " " + sum);
            if(divisors > 500){
                System.out.println(sum);
                break;
            }
        }
    }
}
