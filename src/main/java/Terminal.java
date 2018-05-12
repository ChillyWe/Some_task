import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Terminal {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Table table = new Table();

        try {
            /*
            program start here
            you need to enter two integers for starting position
            e.g. java <program> 1 2 --> where 1 is x co-ordinate and 2 is y
             */
            System.out.print("java <program> ");
            String[] line = reader.readLine().split(" ");

            /*
            create knight with start coordinate and write table with that knight
             */
            Knight knight = new Knight(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
            table.drawnTable(knight);

            while (true) {
                // check for the win
                if (knight.getX() == 3 && knight.getY() == 3) {
                    break;
                }

                /*
                next step
                 */
                knight = knight.goForTheWin(knight);
                table.drawnTable(knight);
            }

        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}