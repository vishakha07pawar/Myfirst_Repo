package com.vp.corejava;
//while loops
public class Loops {

    public static void main(String[] args) {

        int x = 10;
        while (x < 15) {
            System.out.println("valid candidate=" + x);
            x = x + 2;
        }
//for loops
        for (int i = 0; i <= 9; i = i + 3) {
            System.out.println("value=" + i);
        }
        //Enhanced for loop

        int[] age = {1, 2, 3, 4, 5};
        for (int y : age) {
            System.out.print(y);
            System.out.print(",");
        }
            String[] name = {"nishtha", "vishakha", "prakash"};
            for (String Info : name) {
                System.out.print(Info);
                System.out.print(",");
                int L =Info.length();//define length of words
                System.out.println(L);
            }
        }

    }


