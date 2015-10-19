public class Problem4{
    public static void main(String[] args){
        int top = 1;
        for (int i = 11; i <= 20; i++){
            top *= i;
        }
        System.out.println(top);
        for (int i = 20; i <= top; i++){
            boolean works = true;
            for (int j = 11; j <= 20 && works; j++){
                if (i % j != 0){
                    works = false;
                }
            }
            if (works){
                System.out.println(i);
                break;
            }
        }
    }
}
