public class Problem17{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            int s = 0;
            if (i == 1000){
                s += "onethousand".length();
            } else if (i >= 100){
                s += count(i/100);
                s += "hundred".length();
                if (i % 100 != 0){
                    s += "and".length();
                    s += tens(i % 100);
                }
                //sum += count(i % 10);
            } else {
                s += tens(i);
                //sum += count(i % 10);
            }
            sum += s;
            System.out.println( i + " " + s + " " + sum + " " + i/100 + " " + i%100);
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
        return 0;
    }

    public static int tens(int num){
        if (num < 20 && num > 9){
            switch (num) {
                case 10:
                    return 3;
                case 11:
                    return 5;
                case 12:
                    return 6;
                case 13:
                    return 8;
                case 14:
                    return 8;
                case 15:
                    return 7;
                case 16:
                    return 7;
                case 17:
                    return 9;
                case 18:
                    return 9;
                case 19:
                    return 8;
            }
        }
        int sum = 0;
        sum += count(num % 10);
        switch (num / 10){
            case 1:
                sum += "teen".length();
                System.out.println("This should never happen");
                break;
            case 2:
                sum += "twenty".length();
                break;
            case 3:
                sum += "thirty".length();
                break;
            case 4:
                sum += "forty".length();
                break;
            case 5:
                sum += "fifty".length();
                break;
            case 6:
                sum += "sixty".length();
                break;
            case 7:
                sum += "seventy".length();
                break;
            case 8:
                sum += "eighty".length();
                break;
            case 9:
                sum += "ninety".length();
                break;
            case 0:
                sum += 0;
                break;
        }
        return sum;
    }
}
