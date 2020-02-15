package com.area;

import java.util.Scanner;

public class circle {
    public static void r(){
        System.out.println("반지름을 입력하세요.");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = r*r*Math.PI;
        System.out.println("반지름이 "+r+"인 원의 넓이는 "+area+"입니다.");
    }
    public static void rl(){
        System.out.println("반지름_둘레의 형식으로 입력하세요");
        Scanner sc = new Scanner(System.in);
        String rr = sc.nextLine();
        String[] mr = rr.split("_");
        double res = 0.5*Double.parseDouble(mr[0])*Double.parseDouble(mr[1]);
        System.out.println(res);
    }
    public static void main(String args){
        System.out.println("원의넓이 계산페이지 입니다.\n1:반지름\n2:반지름과 둘레");
        Scanner sc = new Scanner(System.in);
        int scan = sc.nextInt();
        switch (scan){
            case 1:
                r();
                break;
            case 2:
                rl();
                break;
        }
    }
}
