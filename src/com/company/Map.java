package com.company;

public class Map {

    public String[][] Map;

    Map(String[][] Map){
        this.Map=Map;
    }

    private String PlayerRoom = "[☻]", EmptyRoom = "[ ]", WinningRoom = "[►]";
    int x, y;

    void GenerateMap(){
        x = (int) (Math.random()*5);
        y = (int) (Math.random()*5);
        Map[x][y] = PlayerRoom;
    }

    public String DisplayMap(){
        String map1 = "";
        for(int i = 0; i <=Map.length; i++){
            for(int j = 0;j <=Map[i].length; j++){
                map1 = Map[i][j];
            }
            map1 = "\n";
        }
        return map1;
    }
}
