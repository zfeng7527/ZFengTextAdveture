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
        System.out.println("Use wasd to move(LowerCase)*Going Out Of Bounds WILL BREAK* \n< > = player room | [ ] = empty room | [☼] = winning room *notimplemented.\n\n\u001B[31mYou wake up in an unfamiliar place. NOW GO DO SOMETHING USEFUL WITH YOR LIFE");
        while (gameOn){
            System.out.println("\u001B[30m"); //Changes color back to black.
            String move1 = move.nextLine();
            switch(move1){
                case "w":{ //North
                    map1.Map[map1.py][map1.px] = "[" + map1.Map[map1.py][map1.px].substring(1,2) + "]";
                    map1.py--;
                    map1.SetPlayer();
                    System.out.println(map1);
                    break;
                }
                case "d":{ //East
                    map1.Map[map1.py][map1.px] = "[" + map1.Map[map1.py][map1.px].substring(1,2) + "]";
                    map1.px++;
                    map1.SetPlayer();
                    System.out.println(map1);
                    break;
                }
                case "s":{ //South
                    map1.Map[map1.py][map1.px] = "[" + map1.Map[map1.py][map1.px].substring(1,2) + "]";
                    map1.py++;
                    map1.SetPlayer();
                    System.out.println(map1);
                    break;
                }
                case "a":{ //West
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
