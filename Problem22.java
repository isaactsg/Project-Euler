import java.io.*;
import java.util.*;
public class Problem22{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("p022_names.txt"));
        String s = sc.nextLine();
        ArrayList<String> prelim = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s, ",");
        String[] list = new String[st.countTokens()];
        System.out.println(st.countTokens());
        for (int i = 0; st.hasMoreTokens(); i++){
            list[i] = st.nextToken();
            list[i] = list[i].substring(1, list[i].length() - 1);
        }
        list = SortingAlgorithm.sort(list);
        int sum = 0;
        for (int i = 0; i < list.length; i++){
            int score = 0;
            for(int j = 0; j < list[i].length(); j++){
                score += (int)list[i].charAt(j) - 64;
            }
            score *= i + 1;
            sum += score;
        }
        System.out.println(sum);
    }
}
