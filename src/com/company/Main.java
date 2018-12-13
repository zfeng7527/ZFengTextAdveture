package com.company;

import Maps.Map;
import java.util.Scanner;

public class Main {
public static boolean gameOn = true;
    public static void main(String[] args) {

        String[][] map = new String[5][5];
        Map map1 = new Map(map);
        map1.SetPlayer();
        map1.GenerateSpecialRoom("[♥]");
        map1.GenerateSpecialRoom("[☼]");
        map1.fillroom("[ ]");
        System.out.println(map1);

        Scanner move = new Scanner(System.in);
        System.out.println("you wake up, NOW MOVE!!");
        while (gameOn){
            String move1 = move.nextLine();
            switch(move1){
                case "n":{
                    map1.Map[map1.py][map1.px] = "[" + map1.Map[map1.py][map1.px].substring(1,2) + "]";
                    map1.py--;
                    map1.SetPlayer();
                    System.out.println(map1);
                    break;
                }
                case "e":{
                    map1.Map[map1.py][map1.px] = "[" + map1.Map[map1.py][map1.px].substring(1,2) + "]";
                    map1.px++;
                    map1.SetPlayer();
                    System.out.println(map1);
                    break;
                }
                case "s":{
                    map1.Map[map1.py][map1.px] = "[" + map1.Map[map1.py][map1.px].substring(1,2) + "]";
                    map1.py++;
                    map1.SetPlayer();
                    System.out.println(map1);
                    break;
                }
                case "w":{
                    map1.Map[map1.py][map1.px] = "[" + map1.Map[map1.py][map1.px].substring(1,2) + "]";
                    map1.px--;
                    map1.SetPlayer();
                    System.out.println(map1);
                    break;
                }
            }
        }
    }
}
