package Pieces;

import Board.Board;
import Board.Spot;

public class Knight extends Piece { 
    public Knight(boolean white) 
    { 
        super(white); 
    } 
  
    @Override
    public boolean canMove(Board board, Spot start,  
                                            Spot end) 
    { 
        // we can't move the piece to a spot that has 
        // a piece of the same colour 
        if (end.getPiece().isWhite() == this.isWhite()) { 
            return false; 
        } 
  
//        int x = Math.abs(start.getX() - end.getX()); 
//        int y = Math.abs(start.getY() - end.getY()); 
//        return x * y == 2; 
        
        int[] tx = new int[]{-2, -2, -1, 1, 2, 2, 1, -1};
		int[] ty = new int[]{-1, 1, 2, 2, 1, -1, -2, -2};
		boolean result = false;
		
		for(int i=0;i<8;i++) {
			int x = start.getX();
			int y = start.getY();
			if(x+tx[i]>=0 && x+tx[i]<8 && y+ty[i]>=0 && y+ty[i]<8 && x+tx[i]==end.getX() && y+ty[i]==end.getY()) {
				result = true;
			}
		}
		return result;
    }

} 