public class Knight {

    private Integer x;
    private Integer y;

    public Knight() {
    }

    public Knight(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public void move(String direction) {

        switch (direction) {
            case "up":
                this.x = 1;
                break;
            case "down":
                this.x = 3;
                break;
            case "left":
                if (this.y > 1) {
                    this.y -= 1;
                } else {
                    System.out.println("You can't move left");
                }
                break;
            case "right":
                this.y += 1;
                if (this.y > 3) {
                    System.out.println("You can't move right");
                    this.y -= 1;
                }
                break;
                default:
                    System.out.println("You need to chose one direction (up/down/left/right)");
        }
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