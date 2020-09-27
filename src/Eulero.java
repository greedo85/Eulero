import java.util.Scanner;

public class Eulero implements Fields{
    Grid grid;

    public Eulero( int size ) {
        grid = new Grid(size);
        setGrid();
    }

    public void setGrid() {
        grid.setBoard(1, 3, "_"+pole2);
        grid.setBoard(2, 1, "_"+pole4);
        grid.setBoard(4, 3, "_"+pole8);
        grid.setBoard(5, 2, "_"+pole9);
        grid.setBoard(4, 3, "_"+pole10);
        grid.setBoard(1, 2, pole1+"_");
        grid.setBoard(1, 4, pole3+"_");
        grid.setBoard(2, 3, pole5+"_");
        grid.setBoard(3, 2, pole6+"_");
        grid.setBoard(3, 4, pole7+"_");
        grid.setBoard(4, 4, pole11+"_");
        for (int i = 0; i < grid.getBoard().length; i++) {
            for (int j = 0; j < grid.getBoard()[i].length; j++) {
                if (grid.getBoard()[i][j] == null) {
                    grid.setBoard(i, j, "__");
                }
            }
        }
    }

    public void printBoard() {
        System.out.println("     1   2   3   4   5 ");
        for (int i = 1; i < grid.getBoard().length - 1; i++) {
            if (i < 10) {
                System.out.print(i + " :");
            } else {
                System.out.print(i + ":");
            }
            for (int j = 1; j < grid.getBoard()[i].length - 1; j++) {
                System.out.print("[" + grid.getBoard()[i][j] + "]");
            }
            System.out.println(" ");
        }
    }

    public void fillField() {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        scanner.nextLine();
        grid.setField(row, column);

    }
    public void checkGrid()
    {
        grid.checkGrid();
    }
    /*public boolean checkGrid() {
        int counter = 0;
        for (int i = 0; i < grid.getBoard().length; i++) {
            for (int j = 0; j < grid.getBoard()[i].length; j++) {
                for(int k=0;k<grid.getBoard().length;k++)
                {
                    if (grid.getBoard()[i][j].charAt(0) != grid.getBoard()[i][j + 1].charAt(0)) {
                        System.out.println("Wygrałeś");
                        return true;
                    } else {
                        counter += 1;
                        System.out.println(counter);
                    }
                }
            }
        }
        return false;
    }*/
}
