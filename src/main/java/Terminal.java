import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Terminal {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Knight knight = new Knight(2, 2);
        Table table = new Table(knight);
        table.drawnTable();
    }
}