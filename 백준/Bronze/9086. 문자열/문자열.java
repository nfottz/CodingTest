import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++){
            String str = br.readLine();
            System.out.println(str.substring(0, 1) + str.substring(str.length() - 1));
        }
    }
} 