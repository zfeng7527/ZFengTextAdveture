package com.company;

public class Map {

    private String[][] Map;

    Map(String[][] Map){
        this.Map=Map;
    }

    void GenerateSpecialRoom(String room) {

        int x = (int) (Math.random() * 4);
        int y = (int) (Math.random() * 4);
        boolean placed = false;
        while (!placed){
            if (Map[x][y] == null) {
                Map[x][y] = room;
                placed = true;
            } else {
                x = (int) (Math.random() * 4);
                y = (int) (Math.random() * 4);
            }
    }
    }

    void fillroom(String fill){
        for(int i = 0; i < Map.length; i++){
            for(int j = 0;j < Map[i].length; j++) {
                if (Map[i][j] == null) {
                    Map[i][j] = fill;
                }
            }
        }
    }

    public String toString(){
        String map1 = "";
        for(int i = 0; i < Map.length; i++){
            for(int j = 0;j < Map[i].length; j++){
                map1 += Map[i][j];
            }
            map1 += "\n";
        }
        return map1;
    }
}
