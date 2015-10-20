public class Problem10{
    public static void main(String[] args){
        int l = 2000000;
        int[] list = new int[l];
        for(int i = 0; i < l; i++){
            list[i] = i +1;
        }
        list[0] = 0;
        int step = 1;
        for(int i = 0; i < l; i++){
            if(list[i] == 0) continue;
            step = list[i];
            for(int j = i + step; j < l; j += step){
                list[j] = 0;
            }
        }
        long sum = 0L;
        for(int i = 0; i < l; i++){
            sum += list[i];
            if( list[i] != 0) System.out.println(list[i]);
        }
        System.out.println(sum);
    }
}
