public class Problem28{
    public static void main(String[] args){
        int sum = 1;
        int last = 1;
        for (int i = 3; i <= 1001; i+= 2){
            for (int j = 0; j < 4; j++){
                last += i - 1;
                sum += last;
            }
        }
        System.out.println(sum);
    }
}
