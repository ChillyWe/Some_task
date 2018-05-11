public class Knight {

    private Integer x;
    private Integer y;

    public Knight() {
    }

    public Knight(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    private void setX(Integer x) {
        if (x < 1 && x > 3) {
            throw new IllegalArgumentException();
        }
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    private void setY(Integer y) {
        if (y < 1 && y > 3) {
            throw new IllegalArgumentException();
        }
        this.y = y;
    }
}