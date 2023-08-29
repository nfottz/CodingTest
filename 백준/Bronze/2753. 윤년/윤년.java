import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        int answer = 0;
        if(year % 4 == 0 && year % 100 != 0) answer = 1;
        if(year % 400 == 0) answer = 1;
        
        System.out.println(answer);
    }
} 