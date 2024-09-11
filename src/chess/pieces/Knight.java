package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

	public Knight(Board board, Color color) {
		super(board, color);
	}

	public String toString() {
		return "N";
	}
}
