public class Knight {

    private Integer x;
    private Integer y;

    public Knight() {
    }

    public Knight(Integer x, Integer y) {
        this.setX(x);
        this.setY(y);
        if (this.x == 2 && this.y == 2) {
            throw new IllegalArgumentException("You can't move");
        }
    }

    public Integer getX() {
        return x;
    }

    private void setX(Integer x) {
        String debug = "";
        if (x < 1 || x > 3) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    private void setY(Integer y) {
        if (y < 1 || y > 3 ) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.y = y;
    }
}