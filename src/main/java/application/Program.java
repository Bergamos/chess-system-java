package application;

import chess.ChessMatch;

public class Program {

    public static void main(String[] args) {

        var chessMatch = new ChessMatch();
        chessMatch.initialSetup();
        UI.printBoard(chessMatch.getPieces());

    }

}
