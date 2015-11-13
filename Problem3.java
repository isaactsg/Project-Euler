public class Problem3{
    public static void main(String[] args){
        long n = 600851475143l;
        int top =(int) Math.sqrt(n);
        boolean prime = true;
        for(int i = top; i > 2; i--){
            if(n % i == 0){
                for (int j = 3; j <= Math.sqrt(i) && prime; j++){
                    if(i % j == 0)prime = false;
                }
                if(prime) {
                    System.out.println(i);
                    break;
                }
                prime = true;
            }
        }
    }
}
