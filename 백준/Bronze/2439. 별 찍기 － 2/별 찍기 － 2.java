import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i = 1; i <= num; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = num-i; j > 0; j--){
                sb.append(" ");
            }
            for(int k = 0; k < i; k++){
                sb.append("*");
            }
            System.out.println(sb.toString());
        }
    }
} 