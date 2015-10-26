import java.util.*;
public class Problem18{
    public static void main(String[] args){
        String s = "75 95 64 17 47 82 18 35 87 10 20 04 82 47 65 19 01 23 75 03 34 88 02 77 73 07 63 67 99 65 04 28 06 16 70 92 41 41 26 56 83 40 80 70 33 41 48 72 33 47 32 37 16 94 29 53 71 44 65 25 43 91 52 97 51 14 70 11 33 28 77 73 17 78 39 68 17 57 91 71 52 38 17 14 91 43 58 50 27 29 48 63 66 04 68 89 53 67 30 73 16 69 87 40 31 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";
        StringTokenizer st = new StringTokenizer(s);
        int[][] t = new int[15][15];
        //for(int i = 0; i < 15; i++){
            //t[i] = Integer.parseInt(st.nextToken());
        //}
        for(int i = 0; i < 15; i++){
            for(int j = 0; j <= i; j++){
                t[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < 15; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
        int[][] dist = new int[15][15];
        dist[0][0] = t[0][0];
        for(int i = 1; i < 15; i++){
            for(int j = 0; j <= i; j++){
                if(j != 0){
                    dist[i][j] = (dist[i - 1][j - 1] > dist[i - 1][j]) ? dist[i - 1][j - 1] + t[i][j] : dist[i - 1][j] + t[i][j];
                } else {
                    dist[i][j] = dist[i - 1][j] + t[i][j];
                }
            }
        }
        int h = 0;
        for(int i = 0; i < 15; i++){
            if(dist[14][i] > h) h = dist[14][i];
        }
        System.out.println(h);
    }

    public static int triNumBefore(int row){
        return row * (row + 1) / 2;
    }
}
