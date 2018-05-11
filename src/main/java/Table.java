public class Table {

    private Knight knight;

    public Table(Knight knight) {
        this.knight = knight;
    }

    public void drawnTable() {
        System.out.print(repeatString(" ", 15) + 1
                + repeatString(" ", 8) + 2
                + repeatString(" ", 8) + 3);
        System.out.println();
        drawnLine();

        if (this.knight.getX() != 1) {
            drawnClearRow(1);
        } else {
            drawnRowWithKnight(1);
        }
        drawnLine();

        if (this.knight.getX() != 2) {
            drawnClearRow(2);
        } else {
            drawnRowWithKnight(2);
        }
        drawnLine();

        if (this.knight.getX() != 3) {
            drawnClearRow(3);
        } else {
            drawnRowWithKnight(3);
        }
        drawnLine();
    }

    private void drawnLine() {
        System.out.print(repeatString(" ", 12)
                + (repeatString("-", 20)));
        System.out.println();
    }

    private void drawnClearRow(Integer rowNumber) {
        System.out.print(repeatString(" ", 7) + rowNumber + " " + "|"
                + (repeatString(" ", 8) + "|")
                + (repeatString(" ", 8) + "|")
                + (repeatString(" ", 8) + "|"));
        System.out.println();
    }

    private void drawnRowWithKnight(Integer rowNumber) {

        System.out.print(repeatString(" ", 7) + rowNumber + " " + "|");

        if (this.knight.getY() == 1) {
            System.out.print(repeatString(" ", 3) + "X" + repeatString(" ", 4) + "|");
        } else {
            System.out.print((repeatString(" ", 8) + "|"));
        }

        if (this.knight.getY() == 2) {
            System.out.print(repeatString(" ", 3) + "X" + repeatString(" ", 4) + "|");
        } else {
            System.out.print((repeatString(" ", 8) + "|"));
        }

        if (this.knight.getY() == 3) {
            System.out.print(repeatString(" ", 3) + "X" + repeatString(" ", 4) + "|");
        } else {
            System.out.print((repeatString(" ", 8) + "|"));
        }


        System.out.println();
    }

    private String repeatString(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}