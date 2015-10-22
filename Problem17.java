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
                sum += tens(i/100);
                sum += count(i % 10);
            } else if (i < 10){
                sum += count(i);
            } else {
                sum += tens(i);
                sum += count(i % 10);
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

    public static int tens(int num){
        num /= 10;
        switch (num){
            case 1:
                return "teen".length();
            case 2:
                return "twenty".length();
            case 3:
                return "thirty".length();
            case 4:
                return "forty".length();
            case 5:
                return "fifty".length();
            case 6:
                return "sixty".length();
            case 7:
                return "seventy".length();
            case 8:
                return "eighty".length();
            case 9:
                return "ninty".length();
            case 0:
                return 0;
        }
        return -1;
    }
}
