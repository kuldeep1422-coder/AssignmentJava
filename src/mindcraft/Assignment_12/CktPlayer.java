package mindcraft.Assignment_12;

public class CktPlayer implements printable{
    public String name;
    public int runs;

    public CktPlayer(String name, int runs) {
        this.name = name;
        this.runs = runs;
    }

    public CktPlayer() {
        name = "raju";
        runs = 10000;
    }

    @Override
    public String plyerdetail9() {

        return "player name : "+name+" player run "+runs;
    }
}
