public class Problem30{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 2; i < 1000000; i++){
            if (sumDigits(i) == i) sum += i;
        }
        System.out.println(sum);
    }

    static public int sumDigits(int num){
        if (num < 10) return (int)Math.pow(num, 5);
        return (int) Math.pow((num % 10), 5) + sumDigits(num/10);
    }
}
