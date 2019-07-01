import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lesson1 {
    public static void main(String[] args) throws Exception {
        int x = 0;
        System.out.println("ax + b = 0");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите a: ");
        String s = reader.readLine();
        System.out.println("введите b: ");
        String s1 = reader.readLine();
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(s1);
        if(a != 0)
            System.out.println("x = -b/a\n" + "x = " + (-b)/a);
        else
            System.out.println("x - любое число");
    }
}

