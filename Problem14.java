public class Problem14{
    public static void main(String[] args){
        int l = 0, ln = 0;
        int[] list = new int[1000000];
        for(int i = 1; i < 1000000; i++){
            int count  = 0;
            long num = (long) i;
            while (num != 1){
                //if(num < 1000000){
                    //if (list[(int)num] != 0){
                        //num = 1;
                        //count += list[(int)num];
                        //continue;
                    //}
                //}
                if(num % 2 == 0){
                    num /= 2;
                } else {
                    num = (num * 3) + 1;
                }
                //System.out.println(num);
                count++;
            }
            if(count > l){
                l = count;
                ln = i;
                System.out.println(count);
            }
            list[i] = count;
        }
        System.out.println("\n" + ln);
    }
}
