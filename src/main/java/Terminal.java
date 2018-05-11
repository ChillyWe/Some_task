import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Terminal {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            Knight knight = new Knight(1, 2);
            Table table = new Table();
            table.drawnTable(knight);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}