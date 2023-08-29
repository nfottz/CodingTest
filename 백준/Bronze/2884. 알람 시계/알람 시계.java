import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        min -= 45;
        if(min < 0) {
            hour--;
            min += 60;
            if(hour == -1) hour = 23;
        }
        System.out.println(hour + " " + min);
    }
}