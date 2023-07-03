package application;

import chess.CheesMatch;

public class Program {

	public static void main(String[] args) {
		
		CheesMatch chessMatch = new CheesMatch();
		UI.printBoard(chessMatch.getPieces());

	}

}
