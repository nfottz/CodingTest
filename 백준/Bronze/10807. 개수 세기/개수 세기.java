import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        String find = br.readLine();
        int answer = 0;
        for(int i = 0; i < count; i++){
            if(str[i].equals(find)) answer ++;
        }
        System.out.println(answer);
    }
}