package com.company;

public class Main {

    public static void main(String[] args) {

        String[][] map = new String[5][5];
        Map map1 = new Map(map);

        map1.GenerateSpecialRoom("[♥]");
        map1.GenerateSpecialRoom("[☼]");
        map1.fillroom("[ ]");
        System.out.println(map1);
    }
}
