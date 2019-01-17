/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import boadgame.Board;
import boadgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

/**
 *
 * @author root
 */
public class ChessMatch {
    
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }
    
    
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        
        for (int i = 0; i< board.getRows(); i++) {
            for (int j = 0; j< board.getColumns(); j++) {
               mat [i] [j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
        
    }
    
    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    private void initialSetup(){
        placeNewPiece('a', 1, new Rook(Color.BLACK, board));
        placeNewPiece('h', 1, new Rook(Color.BLACK, board));
    }
}
