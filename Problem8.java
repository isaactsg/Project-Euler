public class Problem8{
    public static void main(String[] args){
        for (int a = 0; a < 1001; a++){
            for (int b = 0; b < 1001; b++){
                for (int c = 0; c < 1001; c++){
                    if (a + b + c != 1000 || b <= a || c <= a || c <= b){
                    } else {
                        //System.out.println(a + " " + b + " " + c);
                        if (a*a + b*b == c*c) System.out.println(a + " " + b + " " + c + " " + (a*b*c));
                    }
                }
            }
        }
    }
}
