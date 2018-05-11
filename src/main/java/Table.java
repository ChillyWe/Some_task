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

        drawnRow(1);
        drawnLine();

        drawnRow(2);
        drawnLine();

        drawnRow(3);
        drawnLine();

    }

    private void drawnLine() {
        System.out.print(repeatString(" ", 12)
                + (repeatString("-", 20)));
        System.out.println();
    }

    private void drawnRow(Integer rowNumber) {
        System.out.print(repeatString(" ", 7) + rowNumber + " " + "|"
                + (repeatString(" ", 8) + "|")
                + (repeatString(" ", 8) + "|")
                + (repeatString(" ", 8) + "|"));
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