package application;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.ChessMatch;

public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        System.out.println();
        UI.printBoard(chessMatch.getPieces());
    }
}