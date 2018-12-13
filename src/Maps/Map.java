package Maps;

public class Map {

    public String[][] Map;

    public Map(String[][] Map){
        this.Map=Map;
    }

    public int px = 3,py = 2;

    public void SetPlayer(){
        if(Map[py][px] != null) {
            Map[py][px] = "<" + Map[py][px].substring(1, 2) + ">";
        } else Map[py][px]= "< >";
    }

    public void GenerateSpecialRoom(String room) {

        int x = (int) (Math.random() * 4);
        int y = (int) (Math.random() * 4);
        boolean placed = false;
        while (!placed){
            if (Map[y][x] == null) {
                Map[y][x] = room;
                placed = true;
            } else {
                x = (int) (Math.random() * 4);
                y = (int) (Math.random() * 4);
            }
    }
    }

    public void fillroom(String fill){
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
