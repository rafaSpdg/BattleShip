import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws PositionException {
        Scanner scanner = new Scanner(System.in);
        Game game;
        String name = "";
        int option;
        boolean hasName = false;

        do {
            option = Display.printMenu();

            switch (option) {
                case 1:
                    if (!hasName) {
                        System.out.print("\nWrite here your name: ");
                        name = scanner.next();
                        hasName = true;
                        game = new Game(name);
                        game.run();
                    }
                    break;
                case 2:
                    game = new Game();
                    game.run();
                    break;
                case 3:
                    Display.printRules();
                    break;
            }
        } while (option != 0);

    }
}
