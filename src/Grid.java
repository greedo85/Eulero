
import java.util.Scanner;

public class Grid implements Fields {

    private final String[][] board;
    Scanner scanner = new Scanner(System.in);

    public Grid( int size ) {

        this.board = new String[size][size];
    }

    public String[][] getBoard() {
        return this.board;
    }

    public String getField( int row, int column ) {
        return this.board[row][column];
    }

    /*wyjściowe ustawienie tablicy*/
    public void setBoard( int row, int column, String field ) {

        this.board[row][column] = field;
    }

    public void setField( int row, int column ) {
        System.out.println("Podaj znak: ");
        char ch1 = getField(row, column).charAt(0);
        char ch2 = getField(row, column).charAt(1);
        char field = scanner.next().charAt(0);
        if (ch1 == '_' && ch2 != '_') {
            this.board[row][column] = String.valueOf(field) + ch2;
        } else if (ch2 == '_' && ch1 != '_') {
            this.board[row][column] = ch1 + String.valueOf(field);
        } else if (ch1 == '_' && ch2 == '_') {
            char c2 = scanner.next().charAt(0);
            this.board[row][column] = String.valueOf(field) + c2;

        }
    }

    public void editField( int row, int column ) {
        char ch1 = getField(row, column).charAt(0);
        char ch2 = getField(row, column).charAt(1);
        char ch3 = scanner.next().charAt(0);
        if ((row == 1 && column == 3) || (row == 2 && column == 1) || (row == 4 && column == 3
                || (row == 5 && column == 2) || (row == 4 && column == 3))) {
            board[row][column] = String.valueOf(ch3) + ch2;
        } else if ((row == 1 && column == 2) || (row == 1 && column == 4) ||
                (row == 2 && column == 3) || (row == 3 && column == 2) ||
                (row == 3 && column == 4) || (row == 4 && column == 4)) {
            board[row][column] = ch1 + String.valueOf(ch3);
        } else {
            char ch4 = scanner.next().charAt(0);
            board[row][column] = String.valueOf(ch3) + ch4;


    public boolean checkGrid() {
        for (int i = 1; i < board.length - 1; i++) {
            for (int j = 1; i < board[i].length - 1; j++) {
                for (int k = 1; k < board[j].length - 1; k++) {
                    if (board[i][j].charAt(0) != board[j][k].charAt(0) && board[i][j].charAt(1) != board[j][k].charAt(1)) {
                        System.out.println("OK");
                        return true;
                    } else
                        System.out.println("Nie OK");
                    return false;
                }
            }
        }
        return false;
    }



   /* public boolean checkField( int row, int column ) {
        char charArray[] = {pole1, pole2, pole3, pole4, pole5, pole6, pole7, pole8, pole9, pole10, pole11};
        for (int i = 0; i < charArray.length; i++) {
            if (board[row][column].charAt(0) == charArray[i] || board[row][column].charAt(1) == charArray[i]) {
                return false;
            }
        }
        return false;
    }*/
}
