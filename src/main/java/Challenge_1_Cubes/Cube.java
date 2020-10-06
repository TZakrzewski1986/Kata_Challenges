package Challenge_1_Cubes;

public class Cube {

    private int Side;

    public Cube(int side) {
        Side = Math.abs(side);
    }

    public Cube() {
        Side = 0;
    }

    public int getSide() {
        return Side;
    }

    public void setSide(int side) {
        Side = Math.abs(side);
    }
}
