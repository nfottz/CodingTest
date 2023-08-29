import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        while(a > 2){
            sb.append("long ");
            a -= 4;
        }
        sb.append("int");
        System.out.println(sb.toString());
    }
}