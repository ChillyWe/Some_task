import org.junit.Assert;
import org.junit.Test;

public class KnightTest {


    @Test(expected = IllegalArgumentException.class)
    public void createKnightWithNegativeX() {
        Knight knight = new Knight(-1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createKnightWithNegativeY() {
        Knight knight = new Knight(1, -2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createKnightWithInvalidX() {
        Knight knight = new Knight(10, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createKnightWithInvalidY() {
        Knight knight = new Knight(1, 20);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createKnightThatCantMove() {
        Knight knight = new Knight(2,2);
    }

    @Test
    public void testIfKnightMoveCorrectFrom1x1() {
        Knight knight = new Knight(1,1);
        knight.goForTheWin(knight);
        Assert.assertEquals("x isn't okay", 3L, knight.getX().longValue());
        Assert.assertEquals("y isn't okay", 2L, knight.getY().longValue());
    }

    @Test
    public void testIfKnightMoveCorrectFrom3x2() {
        Knight knight = new Knight(3,2);
        knight.goForTheWin(knight);
        Assert.assertEquals("x isn't okay", 1L, knight.getX().longValue());
        Assert.assertEquals("y isn't okay", 3L, knight.getY().longValue());
    }

    @Test
    public void testIfKnightMoveCorrectFrom1x3() {
        Knight knight = new Knight(1,3);
        knight.goForTheWin(knight);
        Assert.assertEquals("x isn't okay", 2L, knight.getX().longValue());
        Assert.assertEquals("y isn't okay", 1L, knight.getY().longValue());
    }

    @Test
    public void testIfKnightMoveCorrectFrom2x1() {
        Knight knight = new Knight(2,1);
        knight.goForTheWin(knight);
        Assert.assertEquals("x isn't okay", 3L, knight.getX().longValue());
        Assert.assertEquals("y isn't okay", 3L, knight.getY().longValue());
    }

    @Test
    public void testIfKnightMoveCorrectFrom1x2() {
        Knight knight = new Knight(1,2);
        knight.goForTheWin(knight);
        Assert.assertEquals("x isn't okay", 3L, knight.getX().longValue());
        Assert.assertEquals("y isn't okay", 3L, knight.getY().longValue());
    }

    @Test
    public void testIfKnightMoveCorrectFrom3x1() {
        Knight knight = new Knight(3,1);
        knight.goForTheWin(knight);
        Assert.assertEquals("x isn't okay", 1L, knight.getX().longValue());
        Assert.assertEquals("y isn't okay", 2L, knight.getY().longValue());
    }

    @Test
    public void testIfKnightMoveCorrectFrom2x3() {
        Knight knight = new Knight(2,3);
        knight.goForTheWin(knight);
        Assert.assertEquals("x isn't okay", 3L, knight.getX().longValue());
        Assert.assertEquals("y isn't okay", 1L, knight.getY().longValue());
    }
}