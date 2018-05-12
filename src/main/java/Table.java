
/*
    Helper class for drowning 3*3 chess board with knight on it
*/


public class Table {

    public Table() {
    }

    /**
     *  main method for drawnTable
     *
     * @param knight
     */

    public void drawnTable(Knight knight) {
        /*
        first row with under line
         */
        System.out.print(repeatString(" ", 12) + 1
                + repeatString(" ", 7) + 2
                + repeatString(" ", 7) + 3);
        System.out.println();
        writeLine();

        /*
        second row with under line
         */
        if (knight.getY() != 1) {
            writeClearRow(1);
        } else {
            writeRowWithKnight(1, knight);
        }
        writeLine();

        /*
        third row with under line
         */
        if (knight.getY() != 2) {
            writeClearRow(2);
        } else {
            writeRowWithKnight(2, knight);
        }
        writeLine();

        /*
        last row with under line
         */
        if (knight.getY() != 3) {
            writeClearRow(3);
        } else {
            writeRowWithKnight(3, knight);
        }
        writeLine();

        System.out.println();
        System.out.println();

        /*
        winners only
         */
        if (knight.getX() == 3 && knight.getY() == 3) {
            System.out.println("              KNIGHT WIN ");
        }
    }

    /*
    write under line
     */
    private void writeLine() {
        System.out.print(repeatString(" ", 8)
                + (repeatString("-", 25)));
        System.out.println();
    }

    /*
    write row without knight
     */
    private void writeClearRow(Integer rowNumber) {
        System.out.print(repeatString(" ", 6) + rowNumber + " " + "|"
                + (repeatString(" ", 7) + "|")
                + (repeatString(" ", 7) + "|")
                + (repeatString(" ", 7) + "|"));
        System.out.println();
    }

    /*
    write row with knight
     */
    private void writeRowWithKnight(Integer rowNumber, Knight knight) {

        System.out.print(repeatString(" ", 6) + rowNumber + " " + "|");

        if (knight.getX() == 1) {
            System.out.print(repeatString(" ", 3) + "X" + repeatString(" ", 3) + "|");
        } else {
            System.out.print((repeatString(" ", 7) + "|"));
        }

        if (knight.getX() == 2) {
            System.out.print(repeatString(" ", 3) + "X" + repeatString(" ", 3) + "|");
        } else {
            System.out.print((repeatString(" ", 7) + "|"));
        }

        if (knight.getX() == 3) {
            System.out.print(repeatString(" ", 3) + "X" + repeatString(" ", 3) + "|");
        } else {
            System.out.print((repeatString(" ", 7) + "|"));
        }
        System.out.println();
    }

    /**
     * helping method for concatenate repeated string
     *
     * @param strToRepeat text to repeat
     * @param count how many times to repeat
     * @return String result
     */

    private String repeatString(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}