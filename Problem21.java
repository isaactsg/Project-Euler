public class Problem21{
    public static void main(String[] args){
        int[] sums = new int[10000];
        int sum = 0;
        for(int i = 1; i < 10000; i++){
            int sumD = 0;
            int top = (int) (Math.sqrt(i));
            for(int j = 1; j <= top; j++){
                if (i % j == 0){
                    //~ if(i == 220)System.out.println(j + " " + i/j);
                    sumD += j;
                    int mirror = i/j;
                    if (mirror != j && j != 1) sumD += mirror;
                }
            }
            sums[i] = sumD;
            //System.out.println(sumD);
        }
        System.out.println(sums[284]);
        System.out.println(sums[220]);
        int[] am = new int[10000];
        for (int i = 0; i < 10000; i++){
            for (int j = 0; j < 10000; j++){
                if (i == j) continue;
                if (sums[i] == j && sums[j] == i){
                    am[i] = i;
                    am[j] = j;
                }
                //~ if (sums[i] == sums[j]){
                    //~ sum += i;
                    //~ j = 10000000;
                //~ }
            }
        }
        for (int i = 0; i < 10000; i++){
            sum += am[i];
            if (am[i] != 0) System.out.println(am[i]);
        }
        System.out.println(sum);
    }
}
