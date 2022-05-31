package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введіть число:");
        int number=(int) (Math.random()*6);
        int num;
        for (int i=0;i<5;i++){
            num=scanner.nextInt();
            if(number==num){
                System.out.println("Молодець");
                break;
            }else{
                System.out.println("Спробуйте ще раз");
            }

        }


    }
}
