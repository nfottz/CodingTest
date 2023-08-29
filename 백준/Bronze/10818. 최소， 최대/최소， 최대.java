import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(st.nextToken());
        int max = min;
        while(st.hasMoreTokens()){
            int a = Integer.parseInt(st.nextToken());
            min = Math.min(min, a);
            max = Math.max(max, a);
        }
        System.out.println(min + " " + max);
        
    }
}