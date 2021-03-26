package com.alevel;

public class dz6 {
    public static void main(String[] args) {
        Phone p1 = new Phone(1, 2, 3),
                p2 = new Phone(11, 22, 33),
                p3 = new Phone(111, 222, 333);

        System.out.println(p1);
        p1.recieveCall("Kevin");
        System.out.println(p1.getNumber());
        System.out.println(p2);
        p2.recieveCall("John");
        System.out.println(p2.getNumber());
        System.out.println(p3);
        p2.recieveCall("Maggy");
        System.out.println(p3.getNumber());
        int[][] triangle = new int[4][];

        triangle[0] = new int[1];
        triangle[1] = new int[2];
        triangle[2] = new int[3];
        triangle[3] = new int[4];
//triangle[4] = new int[5];

        for (int i = 0; i < triangle.length; i++) {
            System.out.println(triangle.length + "!");
            System.out.println("i = " + i);
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.println(triangle[i].length);
                triangle[i][j] = 0;
            }

        }

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }

    }
}