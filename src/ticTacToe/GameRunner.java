package ticTacToe;
import java.util.Scanner;

public class GameRunner {
    private int enteredRow, enteredCol;
    Scanner scanner = new Scanner(System.in);

    public int getEnteredRow() {
        return enteredRow;
    }

    public int getEnteredCol() {
        return enteredCol;
    }


    public void startMessage(){
        System.out.println();
        System.out.println("\t==******====Tic==Tac==Toe==******====" +
                "\n\t\tbest of luck to all players.");
        System.out.println("==============================================");
    }

    public void endMessage(){
        System.out.println();
        System.out.println("hope you enjoy this game!!");
        System.out.println("============X==X==X============");
    }

    public void getPlayerMove(String userType){
        System.out.println();
        System.out.println("Player \""+userType + "\" Turn");
        System.out.print("Enter Row: ");
        enteredRow = scanner.nextInt();
        System.out.print("Enter Column: ");
        enteredCol = scanner.nextInt();
        System.out.println();
    }


    public void matchDrawMessage(){
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("\t****---Oh no!... IT'S TIE---****");
        System.out.println("***************************************************");
    }
}
