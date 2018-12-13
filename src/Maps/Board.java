package Maps;

public class Board {
    Map[][] map;

    public Board(Map[][] Map){this.map=Map;}
    public Board(int height, int width){map=new Map[height][width]}
    public void addRoom(Map maps,int row, int col) {
        map[row][col] = maps;
    }
    }
}
