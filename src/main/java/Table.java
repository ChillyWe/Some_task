public class Table {

    public Table() {
    }

    public void drawnTable(Knight knight) {
        System.out.print(repeatString(" ", 12) + 1
                + repeatString(" ", 7) + 2
                + repeatString(" ", 7) + 3);
        System.out.println();
        drawnLine();

        if (knight.getX() != 1) {
            drawnClearRow(1);
        } else {
            drawnRowWithKnight(1, knight);
        }
        drawnLine();

        if (knight.getX() != 2) {
            drawnClearRow(2);
        } else {
            drawnRowWithKnight(2, knight);
        }
        drawnLine();

        if (knight.getX() != 3) {
            drawnClearRow(3);
        } else {
            drawnRowWithKnight(3, knight);
        }
        drawnLine();
    }

    private void drawnLine() {
        System.out.print(repeatString(" ", 8)
                + (repeatString("-", 25)));
        System.out.println();
    }

    private void drawnClearRow(Integer rowNumber) {
        System.out.print(repeatString(" ", 6) + rowNumber + " " + "|"
                + (repeatString(" ", 7) + "|")
                + (repeatString(" ", 7) + "|")
                + (repeatString(" ", 7) + "|"));
        System.out.println();
    }

    private void drawnRowWithKnight(Integer rowNumber, Knight knight) {

        System.out.print(repeatString(" ", 6) + rowNumber + " " + "|");

        if (knight.getY() == 1) {
            System.out.print(repeatString(" ", 3) + "X" + repeatString(" ", 3) + "|");
        } else {
            System.out.print((repeatString(" ", 7) + "|"));
        }

        if (knight.getY() == 2) {
            System.out.print(repeatString(" ", 3) + "X" + repeatString(" ", 3) + "|");
        } else {
            System.out.print((repeatString(" ", 7) + "|"));
        }

        if (knight.getY() == 3) {
            System.out.print(repeatString(" ", 3) + "X" + repeatString(" ", 3) + "|");
        } else {
            System.out.print((repeatString(" ", 7) + "|"));
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