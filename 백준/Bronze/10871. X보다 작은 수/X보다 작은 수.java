import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st1.nextToken());
        int x = Integer.parseInt(st1.nextToken());
        
        StringBuilder sb = new StringBuilder();
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        while(st2.hasMoreTokens()){
            int a = Integer.parseInt(st2.nextToken());
            if(a < x) sb.append(a + " ");
        }
        
        System.out.println(sb.toString());
    }
} 