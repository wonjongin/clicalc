package com.calc;

import java.util.Scanner;

public class calc {
    public static void main(){
        String oper="_";
        Scanner sc = new Scanner(System.in);
        System.out.println("사칙연산\n형식: 첫번쩨수_연산자번호_두번째수\n예시:1+2을 입력하려면 1_+_2을 입력하세요");
        String A = sc.nextLine();
        String[] Amp = A.split("_");
        double res = 0;
        double num1 = Double.parseDouble(Amp[0]);
        double num2 = Double.parseDouble(Amp[2]);
        switch (Amp[1]){
            case "+":
                res=num1+num2;
                oper ="+";
                break;
            case "-":
                res=num1-num2;
                oper ="-";
                break;
            case "*":
                res=num1*num2;
                oper ="*";
                break;
            case "/":
                res=num1/num2;
                oper ="/";
                break;
            case "%":
                res=num1%num2;
                oper ="%";
                break;
        }
        System.out.println(num1+oper+num2+"="+res);
    }
}
