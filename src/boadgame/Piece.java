/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boadgame;

/**
 *
 * @author valmir
 */
public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }
    
    //Metodos dos movimentos Posiveis da peças
    
    public abstract boolean[][] possibleMoves();
    
    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }
    public boolean IsThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i<mat.length; i++) {
            for (int j = 0; j<mat.length; j++){
                if (mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    } 
}
