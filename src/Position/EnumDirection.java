package Position;


public enum EnumDirection {
    DirectionEast("E") {
        @Override
        public EnumDirection getLeftDirection() {
            return EnumDirection.DirectionNorth;
        }

        @Override
        public EnumDirection getRightDirection() {
            return EnumDirection.DirectionSouth;
        }

        @Override
        public Coordination getMove() {
            return new Coordination(1, 0);
        }
    },
    DirectionWest("W") {
        @Override
        public EnumDirection getLeftDirection() {
            return EnumDirection.DirectionSouth;
        }

        @Override
        public EnumDirection getRightDirection() {
            return EnumDirection.DirectionNorth;
        }

        @Override
        public Coordination getMove() {
            return new Coordination(-1, 0);
        }
    },
    DirectionSouth("S") {
        @Override
        public EnumDirection getLeftDirection() {
            return EnumDirection.DirectionEast;
        }

        @Override
        public EnumDirection getRightDirection() {
            return EnumDirection.DirectionWest;
        }

        @Override
        public Coordination getMove() {
            return new Coordination(0, -1);
        }
    },
    DirectionNorth("N") {
        @Override
        public EnumDirection getLeftDirection() {
            return EnumDirection.DirectionWest;
        }

        @Override
        public EnumDirection getRightDirection() {
            return EnumDirection.DirectionEast;
        }

        @Override
        public Coordination getMove() {
            return new Coordination(0, 1);
        }
    };

    private String value;

    private EnumDirection(String dir) {
        this.value = dir;
    }

    public String getValue() {
        return value;
    }
    public abstract EnumDirection getLeftDirection();
    public abstract EnumDirection getRightDirection();

    public abstract Coordination getMove();
}
