import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lesson1 {
    public static void main(String[] args) throws Exception {
        System.out.println("ax + b = 0");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите a: ");
        String s = reader.readLine();
        System.out.println("введите b: ");
        String s1 = reader.readLine();
        float a = Float.parseFloat(s);
        float b = Float.parseFloat(s1);
        if(a != 0 && b != 0)
            System.out.println("x = -b/a\n" + "x = " + (-b)/a);
        else
            if( (a == 0 && b == 0))
            System.out.println("x - любое число");
            else
                if(a == 0 && b != 0)
                    System.out.println("уравнение не имеет решения");
                    else
                        if(a !=0 && b == 0)
                            System.out.println(“x = 0”);
    }
}
