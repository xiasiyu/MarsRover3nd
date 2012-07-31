package Position;

public enum EnumDirection {
    DirectionEast("E"),
    DirectionWest("W"),
    DirectionSouth("S"),
    DirectionNorth("N");

    private String value;

    EnumDirection(String dir) {
        this.value = dir;
    }

    public String getValue() {
        return value;
    }

    public EnumDirection getLeftDirection() {
        switch (this) {
            case DirectionNorth:
                return DirectionWest;
            case DirectionWest:
                return DirectionSouth;
            case DirectionSouth:
                return DirectionEast;
            default:
                return DirectionNorth;
        }
    }


    public EnumDirection getRightDirection() {
        switch (this) {
            case DirectionNorth:
                return DirectionEast;
            case DirectionWest:
                return DirectionNorth;
            case DirectionSouth:
                return DirectionWest;
            default:
                return DirectionSouth;
        }
    }

    public Coordination getMove() {
        switch (this) {
            case DirectionNorth:
                return new Coordination(0, 1);
            case DirectionWest:
                return new Coordination(-1, 0);
            case DirectionSouth:
                return new Coordination(0, -1);
            default:
                return new Coordination(1, 0);
        }
    }
}
