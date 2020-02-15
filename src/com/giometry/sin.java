package com.giometry;

import java.util.Scanner;

public class sin {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("삼각비 계산기 입니다.\n형식: 삼각비종류_각도_각도종류\n1:라디안, 2:도");
        String A = sc.nextLine();
        String[] Amp = A.split("_");
        double res = 0;
        double num = Double.parseDouble(Amp[1]);
        if(Integer.parseInt(Amp[2])==2){
            num = Math.toRadians(Double.parseDouble(Amp[1]));
            System.out.println("라디안 ");
        }
        switch (Amp[0]){
            case "sin":
                res = Math.sin(num);
                break;
            case "cos":
                res = Math.cos(num);
                break;
            case "tan":
                res = Math.tan(num);
                break;
            case "csc":
                res = Math.sin(num);
                res = 1/res;
                break;
            case "sec":
                res = Math.cos(num);
                res = 1/res;
                break;
            case "cot":
                res = Math.tan(num);
                res = 1/res;
                break;
        }

        System.out.println(Amp[0]+num+"="+res);
    }
}
