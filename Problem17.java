public class Problem17{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            if (i == 1000){
                sum += "onethousand".length();
            } else if (i >= 100){
                sum += count(i/100);
                sum += "hundred".length();
                sum += "and".length();

            } else if (i < 10){
                sum += count(i);
            } else {

            }
        }
        System.out.println(sum);
    }

    public static int count(int num){
        switch (num){
            case 1:
                return 3;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 4;
            case 5:
                return 4;
            case 6:
                return 3;
            case 7:
                return 5;
            case 8:
                return 5;
            case 9:
                return 4;
        }
        return -1;
    }
}
