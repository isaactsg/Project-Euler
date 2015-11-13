import java.io.*;
public class Problem13{
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("Problem13.txt");
            BufferedReader br = new BufferedReader(fr);
            bigInt[] b = new bigInt[100];
            for(int i = 0; i < 100; i++){
                b[i] = new bigInt();
                b[i].add(br.readLine());
            }
            bigInt sum = new bigInt();
            for(int i = 0; i < 100; i++){
                sum.add(b[i].getNum());
            }
            String num = sum.getNum();
            System.out.println(num.substring(0,10));
        } catch (IOException e){

        }
    }
}
