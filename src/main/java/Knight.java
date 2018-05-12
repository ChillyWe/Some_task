public class Knight {

    private Integer x;
    private Integer y;

    public Knight() {
    }

    public Knight(Integer x, Integer y) {
        this.setX(x);
        this.setY(y);

        /*
        in case we start from this position knight can't move on
         */

        if (this.x == 2 && this.y == 2) {
            throw new IllegalArgumentException("Knight can't move");
        }
    }

    public Integer getX() {
        return x;
    }

    private void setX(Integer x) {
        /*
        validate x
         */
        if (x < 1 || x > 3) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    private void setY(Integer y) {
        /*
        validate y
         */
        if (y < 1 || y > 3 ) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.y = y;
    }


    /**
     *    A method that leads the knight to victory
     *    I'm not sure if this method is optimal
     * @param knight
     * @return knight one jump more close to win
     */

    public Knight goForTheWin (Knight knight) {

/*
 -------------
 | 1 | 2 | 3 |
 -------------
 | 4 | 5 | 6 |
 -------------
 | 7 | 8 | 9 |
 -------------

 If a knight is positioned in square 1, for instance, it can jump to
 squares 6 or 8. Similarly with the other squares. If we let -> mean
 'can jump to' we can list all possible jumps from all the squares:

 1  ->  6,8
 2  ->  7,9
 3  ->  4,8
 4  ->  3,9
 5  ->  none of the squares
 6  ->  1,7
 7  ->  2,6
 8  ->  1,3
 9  ->  2,4

 We can now make the following list of jumps such that in this list the
 knight will only take one step at a time:

 -------------------------------------
 |   |   |   |   |   |   |   |   |   |
 -------------------------------------
   8   1   6   7   2   9   4   3   8

*/
        if (this.x == 1 && this.y == 1) { // case 1
           this.x = 3;
           this.y = 2;
        }
        else if (this.x == 3 && this.y == 2) { // case 6
            this.x = 1;
            this.y = 3;
        } else if (this.x == 1 && this.y == 3) { // case 7
            this.x = 2;
            this.y = 1;
        } else if (this.x == 2 && this.y == 1) { // case 2
            this.x = 3;
            this.y = 3;
        } else if (this.x == 1 && this.y == 2) { // case 4
            this.x = 3;
            this.y = 3;
        } else if (this.x == 3 && this.y == 1) { // case 3
            this.x = 1;
            this.y = 2;
        } else if (this.x == 2 && this.y == 3) { // case 8
            this.x = 3;
            this.y = 1;
        }

        return knight;
    }
}