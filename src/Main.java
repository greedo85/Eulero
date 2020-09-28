import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args ) {
        Eulero eulero = new Eulero(7);
        char choice;
        do {
            eulero.printBoard();
            System.out.println("u - ustaw pole");
            System.out.println("p - popraw pole");
            System.out.println("s - sprawdź czy wygrałeś");
            System.out.println("q - zakończ");
            choice = scanner.next().charAt(0);
            switch (choice)
            {
                case 'u':
                    System.out.println("wpisz koordynaty pola do zapisu:");
                    try {
                    eulero.fillField();
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Poza zasięgiem tablicy");
                }
                    break;
                case 'p':
                    eulero.editField();
                    break;
                case 's':
                    eulero.checkGrid();
                    break;
            }
        }
        while (choice != 'q');
    }
}
