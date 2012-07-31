package Position;

public class Plateau {
    private Coordination coordination;

    public Plateau(Coordination coordination) {
        System.out.println();
        this.coordination = coordination;
    }

    public Integer getMaxX() {
        return coordination.getXPos();
    }

    public Integer getMaxY() {
        return coordination.getYPos();
    }
}
