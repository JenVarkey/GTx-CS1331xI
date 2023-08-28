import java.util.Scanner;

public class Battleship{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //greet player and make new line
        System.out.println("Welcome to Battleship!");
        System.out.println();

        //create player ship boards
        char[][] playerOneBoard = new char[5][5];
        char[][] playerTwoBoard = new char[5][5];

        //fill player ship boards with '-'
        for(int r = 0; r < playerOneBoard.length; r++){
            for(int c = 0; c < playerOneBoard[0].length; c++){
                playerOneBoard[r][c] = '-';
            }
        }
        for(int r = 0; r < playerTwoBoard.length; r++){
            for(int c = 0; c < playerTwoBoard[0].length; c++){
                playerTwoBoard[r][c] = '-';
            }
        }



        //make errorMessage variable so i dont have to rewrite it
        String errorMessage = "Invalid coordinates. Choose different coordinates.";
        int count1 = 1;
        System.out.println("PLAYER 1, ENTER YOUR SHIPS’ COORDINATES.");
        do{
            System.out.println("Enter ship " + count1 + " location:");
            if(input.hasNextInt()){
                int int1 = input.nextInt();
                if(input.hasNextInt()){
                    int int2 = input.nextInt();
                    if(int1 <= 4 && int1 >= 0 && int2 <= 4 && int2 >=0){
                        if(playerOneBoard[int1][int2] == '@'){
                            System.out.println("You already have a ship there. Choose different coordinates.");
                        } else {
                            playerOneBoard[int1][int2] = '@';
                            count1++;
                        }
                    } else {
                        System.out.println(errorMessage);
                    }
                } else {
                    System.out.println(errorMessage);
                }
            } else {
                System.out.println(errorMessage);
            }
        }
        while(count1 <=5);
        printBattleShip(playerOneBoard);
        for(int i = 0; i < 100; i++){
            System.out.println();
        }

        //fill out player 2 board
        int count2 = 1;
        System.out.println("PLAYER 2, ENTER YOUR SHIPS’ COORDINATES.");
        do{
            System.out.println("Enter ship " + count2 + " location:");
            if(input.hasNextInt()){
                int int1 = input.nextInt();
                if(input.hasNextInt()){
                    int int2 = input.nextInt();
                    if(int1 <= 4 && int1 >= 0 && int2 <= 4 && int2 >=0){
                        if(playerTwoBoard[int1][int2] == '@'){
                            System.out.println("You already have a ship there. Choose different coordinates.");
                        } else {
                            playerTwoBoard[int1][int2] = '@';
                            count2++;
                        }
                    } else {
                        System.out.println(errorMessage);
                    }
                } else {
                    System.out.println(errorMessage);
                }
            } else {
                System.out.println(errorMessage);
            }

        }
        while(count2 <=5);
        printBattleShip(playerTwoBoard);
        for(int i = 0; i < 100; i++){
            System.out.println();
        }


        int sunkShipsOne = 0;
        int sunkShipsTwo = 0;
        char[][] board1 = new char[5][5];
        char[][] board2 = new char[5][5];

        for(int r = 0; r < board1.length; r++){
            for(int c = 0; c < board1[0].length; c++){
                board1[r][c] = '-';
            }
        }
        for(int r = 0; r < board2.length; r++){
            for(int c = 0; c < board2[0].length; c++){
                board2[r][c] = '-';
            }
        }

        int player = 1;
        while(sunkShipsOne < 5 && sunkShipsTwo < 5){

               if(player==1) {
                   System.out.println("Player 1, enter hit row/column:");
                   if (input.hasNextInt()) {
                       int int1 = input.nextInt();
                       if (input.hasNextInt()) {
                           int int2 = input.nextInt();
                           if (int1 <= 4 && int1 >= 0 && int2 <= 4 && int2 >= 0) {
                                   if (board1[int1][int2] == '-' && playerTwoBoard[int1][int2] == '@') {
                                       System.out.println("PLAYER 1 HIT PLAYER 2’s SHIP!");
                                       board1[int1][int2] = 'X';
                                       playerTwoBoard[int1][int2] = 'X';
                                       printBattleShip(board1);
                                       sunkShipsTwo++;
                                       player = 2;
                                   } else if (board1[int1][int2] == '-' && playerTwoBoard[int1][int2] == '-') {
                                       System.out.println("PLAYER 1 MISSED!");
                                       board1[int1][int2] = 'O';
                                       playerTwoBoard[int1][int2] = 'O';
                                       printBattleShip(board1);
                                       player = 2;
                                   } else {
                                       System.out.println("You already fired on this spot. Choose different coordinates.");
                                   }
                               } else {
                                   System.out.println(errorMessage);
                               }

                       } else {
                           System.out.println(errorMessage);
                       }
                   } else {
                       System.out.println(errorMessage);
                   }

               }
                if(player == 2) {
                    System.out.println("Player 2, enter hit row/column:");
                    if (input.hasNextInt()) {
                        int int1 = input.nextInt();
                        if (input.hasNextInt()) {
                            int int2 = input.nextInt();
                            if (int1 <= 4 && int1 >= 0 && int2 <= 4 && int2 >= 0) {
                                    if (board2[int1][int2] == '-' && playerOneBoard[int1][int2] == '@') {
                                        System.out.println("PLAYER 2 HIT PLAYER 1’s SHIP!");
                                        board2[int1][int2] = 'X';
                                        playerOneBoard[int1][int2] = 'X';
                                        sunkShipsOne++;
                                        printBattleShip(board2);
                                        player = 1;
                                    } else if (board2[int1][int2] == '-' && playerOneBoard[int1][int2] == '-') {
                                        System.out.println("PLAYER 2 MISSED!");
                                        board2[int1][int2] = 'O';
                                        playerOneBoard[int1][int2] = 'O';
                                        printBattleShip(board2);
                                        player = 1;
                                    } else {
                                        System.out.println("You already fired on this spot. Choose different coordinates.");
                                    }
                                } else {
                                    System.out.println(errorMessage);
                                }

                        } else {
                            System.out.println(errorMessage);
                        }
                    } else {
                        System.out.println(errorMessage);
                    }
                }
        }



        int winner;
        if(sunkShipsOne > sunkShipsTwo){
            winner = 2;
        } else {
            winner = 1;
        }

        System.out.println("PLAYER " + winner + " WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
        System.out.println();
        System.out.println("Final boards:");
        System.out.println();
        printBattleShip(playerOneBoard);
        printBattleShip(playerTwoBoard);
    }


    // Use this method to print game boards to the console.
    private static void printBattleShip(char[][] player) {
        System.out.print("  ");
        for (int row = -1; row < 5; row++) {
            if (row > -1) {
                System.out.print(row + " ");
            }
            for (int column = 0; column < 5; column++) {
                if (row == -1) {
                    System.out.print(column + " ");
                } else {
                    System.out.print(player[row][column] + " ");
                }
            }
            System.out.println("");
        }
    }

}