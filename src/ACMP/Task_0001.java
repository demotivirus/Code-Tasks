package ACMP;

import java.util.Scanner;

public class Task_0001 {

    public static int a, b;
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        input();
        logic();

    }

    public static void input(){
        a = scn.nextInt();
        b = scn.nextInt();
    }

    public static void logic(){
        int logic = a + b;
        System.out.println(logic);
    }
}
