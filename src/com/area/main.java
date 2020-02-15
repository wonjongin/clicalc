package com.area;
import com.area.circle;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        System.out.println("넓이 계산 페이지 입니다!\n1:원, 3:삼각형");
        Scanner sc = new Scanner(System.in);

        circle circle = new circle();


        int scan = sc.nextInt();
        switch (scan){
            case 1:
                circle.main("3");
        }
    }
}
