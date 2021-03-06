package chess.game.mvc.model.chessPieces.chessPiecesImp;

import chess.game.mvc.model.chessPieces.ChessPiece;

public class Rook extends ChessPiece {

	private static final long serialVersionUID = 1L;
	
	private boolean canCastle;
	
	public Rook() {
		super();
		this.canCastle = true;
	}
	
	public Rook(boolean isWhite) {
		super(isWhite);
		this.canCastle = true;
	}
	
	public Rook(boolean isWhite, boolean canCastle) {
		super(isWhite);
		this.canCastle = canCastle;
	}
	
	public Rook(String id, boolean isWhite, boolean canCastle) {
		super(id, isWhite);
		this.canCastle = canCastle;
	}

	public Rook(String id, boolean isWhite) {
		super(id, isWhite);
		this.canCastle = true;
	}
	
	public boolean getCastle() {
		return canCastle;
	}
	
	public void setCastle(boolean canCastle) {
		this.canCastle = canCastle;
	}
	
	@Override
	public Rook copyPiece() {
		return new Rook(this.getId(), this.getWhite(), this.canCastle);
	}
}