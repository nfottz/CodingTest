import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 0; i < count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int price = Integer.parseInt(st.nextToken());
            int amount = Integer.parseInt(st.nextToken());
            sum += price * amount;
        }
        String answer = total == sum? "Yes": "No";
        System.out.println(answer);
    }
}