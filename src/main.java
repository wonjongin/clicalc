import java.util.Scanner;
import com.calc.calc;
import com.giometry.sin;

public class main {
    public static void main(String[] agrs){
        sin sin = new sin();
        calc cl = new calc();
        System.out.println("만능 계산기입니다.\n1:사칙연산\n2:넓이계산\n3:단위변환\n4:삼각비");
        Scanner sc = new Scanner(System.in);
        int scan = sc.nextInt();
        switch (scan){
            case 1:
                cl.main();
                break;
            case 4:
                sin.main();
                break;
        }


    }
}
