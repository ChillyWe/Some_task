import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Terminal {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Table table = new Table();

        try {
            System.out.print("java <program>");
            String[] line = reader.readLine().split("");


            Knight knight = new Knight(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
            table.drawnTable(knight);

            while (true) {
                // check for the win
                if (knight.getX() == 3 && knight.getY() == 3) {
                    break;
                }

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