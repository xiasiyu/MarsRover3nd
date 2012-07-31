package Position;

public class Coordination {
    private int xpos;
    private int ypos;

    public Coordination(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public String toString() {
        return String.valueOf(xpos) + String.valueOf(ypos);
    }


    public Integer getXPos() {
        return xpos;
    }

    public Integer getYPos() {
        return ypos;
    }

    public void add(Coordination steps) {
        this.xpos += steps.getXPos();
        this.ypos += steps.getYPos();
    }
}
