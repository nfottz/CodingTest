import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] arr = new int[6];
        arr[a - 1]++;
        arr[b - 1]++;
        arr[c - 1]++;
        int answer = 0;
        for(int i = 0; i < 6; i++){
            if(arr[i] == 3) {
                answer = 10000 + (i + 1) * 1000; break;
            }
            if(arr[i] == 2) {
                answer = 1000 + (i + 1) * 100; break;
            } if(arr[i] == 1){
                answer = (i + 1) * 100;
            }
        }
        System.out.println(answer);
    }
}