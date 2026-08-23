package mindcraft.Assignment_12;

public class FtPlayer implements printable {
    public String name;
    public int gosls;

    public FtPlayer(int gosls, String name) {
        this.gosls = gosls;
        this.name = name;
    }

    public FtPlayer() {
        gosls = 5;
        name = "kuldeep";
    }



    @Override
    public String plyerdetail9() {
        return "player name:  "+name +"  player goals "+gosls;
    }
}
