public class Problem21{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1; i < 10000; i++){
            int sumD = 0;
            for(int j = 1; j < i; j++){
                if (i % j == 0){
                    sumD += j;
                }
            }
            int sumD2 = 0;
            for (int j = 1; j < sumD; j++){
                if (sumD % j == 0){
                    sumD2 += j;
                }
            }
            if (sumD2 == i) sum += i;
        }
        System.out.println(sum);
    }
}
