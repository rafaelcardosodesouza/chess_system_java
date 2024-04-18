package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

    public Knight(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "N";
    }

    private boolean canMove(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        int[][] directions = { {-1, -2}, {-2, -1}, {-2, +1}, {-1, +2}, {+1, +2}, {+2, +1}, {+2, -1}, {+1, -2} };

        for (int[] direction : directions) {
            int newRow = position.getRow() + direction[0];
            int newColumn = position.getColumn() + direction[1];

            Position newPosition = new Position(newRow, newColumn);

            if (getBoard().positionExists(newPosition) && canMove(newPosition)) {
                mat[newRow][newColumn] = true;
            }
        }
        return mat;
    }
}

